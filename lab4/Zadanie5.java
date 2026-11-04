package lab4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Zadanie5 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wprowadz tekst:");
        String text = reader.readLine().trim();

        LocalDate date = null;

        try {
            date = LocalDate.parse(text);
            System.out.println("Valid date");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date");
        }

        System.out.println(date);
    }
}
