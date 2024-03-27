import java.util.Scanner;

public class ParkirMalamMinggu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tipeKendaraan = scanner.nextInt();
        int waktuParkir = scanner.nextInt();
        int tarifParkir = hitungTotalTarifParkir(tipeKendaraan, waktuParkir);

        if (tarifParkir == -1) {
            System.out.println("disegel");
        } else {
            System.out.println(tarifParkir);
        }
        scanner.close();
    }

    public static int hitungTotalTarifParkir(int tipeKendaraan, int waktuParkir) {
        int tarifPerJam = 0;

        int kendaraanMobil = 1;
        int kendaraanMotor = 2;
        int batasWaktuParkir = 8;

        if (tipeKendaraan == kendaraanMobil) {
            tarifPerJam = 1500;
        } else if (tipeKendaraan == kendaraanMotor) {
            tarifPerJam = 1000;
        }

        int totalTarif = tarifPerJam * waktuParkir;

        if (waktuParkir > 5) {
            totalTarif += 500 * (waktuParkir - 5);
        }

        if (waktuParkir > batasWaktuParkir) {
            return -1;
        }

        return totalTarif;
    }
}