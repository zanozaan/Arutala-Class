import java.util.Scanner;

public class MesinAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kelipatanUang = 5;

        int uangDiambil = scanner.nextInt();

        double saldoRekening = scanner.nextDouble();

        double biayaPenarikanUang = 0.5; // biayaPenarikanUang sama saja dengan biaya admin

        double totalBiaya = uangDiambil + biayaPenarikanUang;
        if (saldoRekening >= totalBiaya && uangDiambil % kelipatanUang == 0) {
            saldoRekening -= totalBiaya;
        }

        System.out.printf("%.2f", saldoRekening);

        scanner.close();
    }
}
