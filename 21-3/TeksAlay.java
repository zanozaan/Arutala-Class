import java.util.Scanner;

public class TeksAlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.length() > 50) {
            System.out.println("Teks maksimal 50 karakter.");
        } else {
            String teksAlay = menjadiAlay(input);
            System.out.println(teksAlay);
        }

        scanner.close();
    }

    public static String menjadiAlay(String text) {
        char[] alayChars = { 'a', 'A', 'i', 'I', 'z', 'Z', 'e', 'E', 'g', 'G', 'j', 'J', 'b', 'B' };
        char[] replaceChars = { '4', '4', '1', '1', '2', '2', '3', '3', '6', '6', '7', '7', '8', '8' };

        for (int i = 0; i < alayChars.length; i++) {
            text = text.replace(alayChars[i], replaceChars[i]);
        }

        return text;
    }
}
