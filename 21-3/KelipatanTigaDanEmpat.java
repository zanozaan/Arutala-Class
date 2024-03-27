import java.util.Scanner;

public class KelipatanTigaDanEmpat {

    public static boolean rangeBilangan(int bilangan) {
        return (bilangan >= 1 && bilangan <= 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilangan;
        int cek;

        bilangan = scanner.nextInt();

        if (rangeBilangan(bilangan)) {
            if (bilangan % 3 == 0 && bilangan % 4 == 0) {
                cek = 1;
            } else {
                cek = 0;
            }
            System.out.println(cek);
        }

        scanner.close();
    }
}
