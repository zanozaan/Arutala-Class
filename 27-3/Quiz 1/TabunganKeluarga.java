import java.util.Scanner;

public class TabunganKeluarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // Jumlah anggota keluarga
        int n = scanner.nextInt(); // Lama tabungan (bulan)

        long totalTabungan = calculateSavings(m, n);

        System.out.println(totalTabungan);

        scanner.close();
    }

    public static long calculateSavings(int m, int n) {
        long totalTabungan = 0;

        for (int month = 1; month <= n; month++) {
            int daysInMonth = getDaysInMonth(month);

            for (int member = 1; member <= m; member++) {
                long savingsPerMember = 0;
                for (int day = 1; day <= daysInMonth; day++) {
                    savingsPerMember += day;
                }

                totalTabungan += savingsPerMember;
            }
        }

        return totalTabungan;
    }

    public static int getDaysInMonth(int month) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        return daysInMonth[month - 1];
    }
}
