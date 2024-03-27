import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt(); // Jumlah orang
        int d = scanner.nextInt(); // Lama hari menginap
        int b = scanner.nextInt(); // Budget

        int[][] biaya = {
                { 2170000, 125000, 75000, 250000 }, // Lombok
                { 3780000, 155000, 55000, 300000 }, // Bangkok
                { 1200000, 170000, 85000, 360000 }, // Singapura
                { 4760000, 170000, 105000, 325000 } // Tokyo
        };

        int[] totalBiaya = new int[4];

        for (int i = 0; i < 4; i++) {
            totalBiaya[i] = p * biaya[i][0] + d * p * (biaya[i][1] + biaya[i][2]);
            if (i == 0) // Lombok
                totalBiaya[i] += biaya[i][3] * p;
        }

        // Mencari destinasi yang sesuai dengan budget
        String[] destinasi = { "Lombok", "Bangkok", "Singapura", "Tokyo" };
        int minBiaya = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < 4; i++) {
            if (totalBiaya[i] <= b && totalBiaya[i] < minBiaya) {
                minBiaya = totalBiaya[i];
                index = i;
            }
        }

        // Output hasil rekomendasi
        if (index == -1) {
            System.out.println("Need more budget");
        } else {
            System.out.println(destinasi[index] + " " + minBiaya);
        }

        scanner.close();
    }
}
