import java.util.Scanner;

public class UrutanDataInteger {

    public static boolean rangeBilangan(int bilangan) {
        return (bilangan >= -300 && bilangan <= 300);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bilangan = new int[3];
        for (int x = 0; x < 3; x++) {
            int input;
            input = scanner.nextInt();
            if (!rangeBilangan(input)) {
                System.out.println("Bilangan tidak valid! Masukkan kembali.");
                x--;
            } else {
                bilangan[x] = input;
            }
        }

        for (int x = 0; x < bilangan.length - 1; x++) {
            for (int y = x + 1; y < bilangan.length; y++) {
                if (bilangan[x] < bilangan[y]) {
                    int temp = bilangan[x];
                    bilangan[x] = bilangan[y];
                    bilangan[y] = temp;
                }
            }
        }

        for (int x = 0; x < 3; x++) {
            System.out.print(bilangan[x] + " ");
        }
        scanner.close();

    }
}
