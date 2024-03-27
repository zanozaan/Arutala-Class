import java.util.Scanner;

public class KataBerlubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int totalLubang = banyakLubang(word);
        System.out.println(totalLubang);

        scanner.close();
    }

    public static int banyakLubang(String word) {
        int totalLubang = 0;

        int[] lubang = {
                1, // a
                1, // b
                0, // c
                1, // d
                1, // e
                0, // f
                1, // g
                0, // h
                0, // i
                0, // j
                0, // k
                0, // l
                0, // m
                0, // n
                1, // o
                1, // p
                1, // q
                0, // r
                0, // s
                0, // t
                0, // u
                0, // v
                0, // w
                0, // x
                0, // y
                0, // z
                1, // A
                2, // B
                0, // C
                1, // D
                0, // E
                0, // F
                0, // G
                0, // H
                0, // I
                0, // J
                0, // K
                0, // L
                0, // M
                0, // N
                1, // O
                1, // P
                1, // Q
                1, // R
                0, // S
                0, // T
                0, // U
                0, // V
                0, // W
                0, // X
                0, // Y
                0, // Z
                1, // 0
                0, // 1
                0, // 2
                0, // 3
                1, // 4
                0, // 5
                1, // 6
                0, // 7
                2, // 8
                1 // 9
        };

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index;
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
            } else if (ch >= 'A' && ch <= 'Z') {
                index = ch - 'A' + 26;
            } else if (ch >= '0' && ch <= '9') {
                index = ch - '0' + 52;
            } else {
                continue;
            }
            totalLubang += lubang[index];
        }

        return totalLubang;
    }
}
