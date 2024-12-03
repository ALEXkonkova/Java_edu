import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        for (var element : list) {
            System.out.print(element+" ");
        }
    }
}