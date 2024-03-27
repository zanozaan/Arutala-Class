import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        String resultText = reverseText(inputText);

        if (resultText != null) {
            System.out.println(resultText);
        }

        scanner.close();
    }

    public static String reverseText(String text) {
        if (text.length() > 10) {
            System.out.println("Text tidak boleh lebih dari 10 karakter.");
            return null;
        }

        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        return new String(charArray);
    }
}
