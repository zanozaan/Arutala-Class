import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();

        int biayaParkir;
        final int mobil = 1;
        final int motor = 2;

        if (jenisKendaraan == motor) {
            biayaParkir = 1000 + (lamaParkir - 1) * 500;
        } else if (jenisKendaraan == mobil) {
            biayaParkir = 2000 + (lamaParkir - 1) * 1000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            scanner.close();
            return;
        }

        System.out.println(biayaParkir);

        scanner.close();
    }
}
