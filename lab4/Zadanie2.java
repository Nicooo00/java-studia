package lab4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie2 {
    public static void main(String[] args) throws IOException {

             BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wprowadz liczby:");

        String text = reader.readLine().trim();
        String[] parts = text.split("\\s+");

        double sum = 0;
        boolean flag = true;

        for (String part : parts) {
            try
            {
                double number = Double.parseDouble(part);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawne dane wejściowe: " + part);
                flag = false;
                break;
            }
        }
        if (flag) {
        System.out.println("Suma: " + sum);
        }

        }
}
