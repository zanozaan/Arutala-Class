import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double jariJari = scanner.nextDouble();
        double tinggi = scanner.nextDouble();

        double PI = 3.14;

        double volume = PI * jariJari * jariJari * tinggi;

        System.out.printf("%.2f\n", volume);

        scanner.close();
    }
}
