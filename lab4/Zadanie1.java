package lab4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wprowadz dwie liczby:");

        String text = reader.readLine().trim();

        String[] parts = text.split("\\s+");


        double first;
        double second;

        try {
            first = Double.parseDouble(parts[0]);
            second = Double.parseDouble(parts[1]);
        }
        catch (NumberFormatException e) {
            System.out.println("Niepoprawne dane wejściowe.");
            return;
        }

        System.out.println("Pierwsza liczba: " + first);
        System.out.println("Druga liczba: " + second);
        System.out.println("Suma: " + (first + second));

    }
}