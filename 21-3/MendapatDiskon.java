import java.util.Scanner;

public class MendapatDiskon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaBarang = scanner.nextInt();
        int jumlahBarang = scanner.nextInt();

        // Harga barang harus berada di antara 10000 dan 1000000, dan jumlah barang
        // harus berada di antara 1 dan 100.
        if (hargaBarang < 10000 || hargaBarang > 1000000 || jumlahBarang < 1 || jumlahBarang > 100) {
            System.out.println("Input tidak valid.");
        } else {
            double totalHarga = hargaBarang * jumlahBarang;

            if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
                totalHarga *= 0.85; // Potongan harga 15%
            }

            System.out.printf("%.2f\n", totalHarga);
        }

        scanner.close();
    }
}
