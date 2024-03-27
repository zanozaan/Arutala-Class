import java.util.Scanner;

public class GanjilDuaDimensi {
    public static void main(String[] args) {
        int[][] X = inputArray();

        int bilanganGanjil = hitungArray(X);
        System.out.println(bilanganGanjil);
    }

    public static int[][] inputArray() {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int hitungArray(int[][] array) {
        int hasil = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    hasil++;
                }
            }
        }
        return hasil;
    }
}