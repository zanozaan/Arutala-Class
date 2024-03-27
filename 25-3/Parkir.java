import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tipeKendaraan = scanner.nextInt();
        int waktuParkir = scanner.nextInt();

        int biayaParkir = calculateParkingFee(tipeKendaraan, waktuParkir);

        if (biayaParkir == -1) {
            System.out.println("Input Error!!!");
        } else {
            System.out.println(biayaParkir);
        }

        scanner.close();
    }

    public static int calculateParkingFee(int tipeKendaraan, int waktuParkir) {
        int biayaParkirJamPertama, biayaParkirPerJam, biayaParkirMaksimal;

        int mobil = 1;
        int motor = 2;
        int mobilBox = 3;

        if (tipeKendaraan == mobil) {
            biayaParkirJamPertama = 5000;
            biayaParkirPerJam = 2000;
            biayaParkirMaksimal = 25000;
        } else if (tipeKendaraan == motor) {
            biayaParkirJamPertama = 2000;
            biayaParkirPerJam = 1000;
            biayaParkirMaksimal = 10000;
        } else if (tipeKendaraan == mobilBox) {
            biayaParkirJamPertama = 10000;
            biayaParkirPerJam = 5000;
            biayaParkirMaksimal = 50000;
        } else {
            return -1;
        }

        if (waktuParkir <= 0) {
            return -1;
        }

        int biayaParkir = biayaParkirJamPertama;
        for (int i = 1; i < waktuParkir; i++) {
            biayaParkir += biayaParkirPerJam;
        }

        if (biayaParkir > biayaParkirMaksimal) {
            return biayaParkirMaksimal;
        } else {
            return biayaParkir;
        }
    }
}
