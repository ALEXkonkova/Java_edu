import java.io.*;
import java.util.*;

// Класс для узла дерева Хаффмана
class HuffmanNode implements Comparable<HuffmanNode>, Serializable {
    int frequency;
    byte data;
    HuffmanNode left, right;

    public HuffmanNode(int frequency, byte data, HuffmanNode left, HuffmanNode right) {
        this.frequency = frequency;
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

// Класс для кодирования и декодирования
public class HuffmanCoding {

    // Метод для построения дерева Хаффмана
    public static HuffmanNode buildTree(int[] frequency) {
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                queue.add(new HuffmanNode(frequency[i], (byte) i, null, null));
            }
        }

        while (queue.size() > 1) {
            HuffmanNode left = queue.poll();
            HuffmanNode right = queue.poll();
            int sum = left.frequency + right.frequency;
            queue.add(new HuffmanNode(sum, (byte) 0, left, right));
        }
        return queue.poll();
    }

    // Метод для построения таблицы кодов
    public static Map<Byte, String> buildCodes(HuffmanNode root) {
        Map<Byte, String> codes = new HashMap<>();
        buildCodes(root, "", codes);
        return codes;
    }

    private static void buildCodes(HuffmanNode node, String code, Map<Byte, String> codes) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            codes.put(node.data, code);
        }
        buildCodes(node.left, code + "0", codes);
        buildCodes(node.right, code + "1", codes);
    }

    // Метод для кодирования файла
    public static void encode(String inputFile, String outputFile) throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        int[] frequency = new int[256];
        int c;
        while ((c = fis.read()) != -1) {
            frequency[c]++;
        }
        fis.getChannel().position(0);

        HuffmanNode root = buildTree(frequency);
        Map<Byte, String> codes = buildCodes(root);

        oos.writeObject(root);
        oos.writeObject(codes);

        while ((c = fis.read()) != -1) {
            String code = codes.get((byte) c);
            for (char bit : code.toCharArray()) {
                oos.write(bit == '1' ? 1 : 0);
            }
        }

        oos.close();
        fis.close();
    }

    // Метод для декодирования файла
    public static void decode(String inputFile, String outputFile) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(inputFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        FileOutputStream fos = new FileOutputStream(outputFile);

        HuffmanNode root = (HuffmanNode) ois.readObject();
        Map<Byte, String> codes = (Map<Byte, String>) ois.readObject();

        HuffmanNode current = root;
        int b;
        while ((b = ois.read()) != -1) {
            current = b == 1 ? current.right : current.left;
            if (current.left == null && current.right == null) {
                fos.write(current.data);
                current = root;
            }
        }

        ois.close();
        fos.close();
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java HuffmanCoding <encode|decode> <inputFile> <outputFile>");
            return;
        }

        String mode = args[0];
        String inputFile = args[1];
        String outputFile = args[2];

        try {
            if (mode.equals("encode")) {
                encode(inputFile, outputFile);
            } else if (mode.equals("decode")) {
                decode(inputFile, outputFile);
            } else {
                System.out.println("Invalid mode. Use 'encode' or 'decode'.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
