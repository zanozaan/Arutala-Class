import java.util.Scanner;

public class TangkiBensin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hargaPerLiter = 7600;
        int uangDimiliki = scanner.nextInt();
        double kapasitas = scanner.nextDouble();

        double jumlahBensin = uangDimiliki / hargaPerLiter;

        System.out.printf("%.2f\n", jumlahBensin);

        if (jumlahBensin > kapasitas) {
            System.out.println("Bensin Berlebih");
        }

        scanner.close();
    }
}
