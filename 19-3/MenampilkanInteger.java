import java.util.Scanner;

public class MenampilkanInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        for (int i = X; i <= Y; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
