import java.util.Scanner;

public class MenghitungHurufBerlubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teks = scanner.nextLine().toUpperCase();

        if (teks.length() > 50) {
            System.out.println("Teks terlalu panjang.");
            return;
        }

        int totalLubang = hitungLubang(teks);
        System.out.println(totalLubang);
    }

    public static int hitungLubang(String teks) {
        int totalLubang = 0;
        // ABCDEFGHIJKLMNOPQRSTUVWXYZ
        int[] lubang = { 1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int x = 0; x < teks.length(); x++) {
            char y = teks.charAt(x);

            if (y >= 'A' && y <= 'Z') {
                totalLubang += lubang[y - 'A'];
            }
        }
        return totalLubang;
    }
}
