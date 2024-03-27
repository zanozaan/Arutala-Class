import java.util.Scanner;

public class CariBilanganTerbesar {
    public static void main(String[] args) {
        int[] array = inputArray();

        int maxNumber = result(array);

        System.out.println(maxNumber);

    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int result(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
