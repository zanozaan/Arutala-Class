import java.util.Scanner;

public class MencariHuruf {
    public static void main(String[] args) {
        char[] X = { 'P', 'a', 'd', 'e', 'p', 'o', 'k', 'a', 'n', '7', '9' };

        Scanner scanner = new Scanner(System.in);

        char huruf = scanner.nextLine().charAt(0);

        boolean cariHuruf = false;
        
        for (int i = 0; i < X.length; i++) {
            if (X[i] == huruf) {
                cariHuruf = true;
                break;
            }
        }

        if (cariHuruf) {
            System.out.println("ada");
        } else {
            System.out.println("tidak ada");
        }

        scanner.close();
    }
}
