import java.util.Scanner;

public class ParkirMalming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenisKendaraan = scanner.nextInt();

        int lamaParkir = scanner.nextInt();

        int biayaParkir = hitungBiayaParkir(jenisKendaraan, lamaParkir);

        if (biayaParkir == -1) {
            System.out.println("disegel");
        } else {
            System.out.println(biayaParkir);
        }

        scanner.close();
    }

    public static int hitungBiayaParkir(int jenisKendaraan, int lamaParkir) {
        int biayaPerJam = 0;

        int mobil = 1;
        int motor = 2;
        int batasWaktuParkir = 8;

        if (jenisKendaraan == mobil) {
            biayaPerJam = 1500;
        } else if (jenisKendaraan == motor) {
            biayaPerJam = 1000;
        }

        int biayaTotal = biayaPerJam * lamaParkir;

        if (lamaParkir > 5) {
            biayaTotal += 500 * (lamaParkir - 5);
        }

        if (lamaParkir > batasWaktuParkir) {
            return -1;
        }

        return biayaTotal;
    }
}
