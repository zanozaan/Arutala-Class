import java.text.DecimalFormat;
import java.util.Scanner;

public class KonvesiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suhuCelcius = scanner.nextDouble();

        double suhuFahrenheit = suhuCelcius * 1.8 + 32;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedSuhuFahrenheit = decimalFormat.format(suhuFahrenheit);

        System.out.println(formattedSuhuFahrenheit);

        scanner.close();
    }
}
