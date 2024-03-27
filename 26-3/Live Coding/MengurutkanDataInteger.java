import java.util.Scanner;

public class MengurutkanDataInteger {

    public static boolean batasInteger(int integer) {
        return (integer >= -300 && integer <= 300);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integer = new int[3];
        for (int x = 0; x < 3; x++) {
            int inputInteger;
            inputInteger = scanner.nextInt();
            if (!batasInteger(inputInteger)) {
                System.out.println("Bilangan diluar batas Integer!!!");
                x--;
            } else {
                integer[x] = inputInteger;
            }
        }

        for (int x = 0; x < integer.length - 1; x++) {
            for (int y = x + 1; y < integer.length; y++) {
                if (integer[x] < integer[y]) {
                    int result = integer[x];
                    integer[x] = integer[y];
                    integer[y] = result;
                }
            }
        }

        for (int x = 0; x < 3; x++) {
            System.out.print(integer[x] + " ");
        }
        scanner.close();
    }
}
