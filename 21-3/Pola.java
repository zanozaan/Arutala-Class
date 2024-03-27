import java.util.Scanner;

public class Pola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int jumlahN = 1;

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < jumlahN; y++) {
                System.out.print("* ");
            }
            System.out.println();

            jumlahN++;
        }

        scanner.close();
    }
}
