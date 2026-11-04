package lab4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wprowadz tekst:");

        String text = reader.readLine().trim();

        String changed = text.replace("Jan", "Janek").replace("jan", "janek");

        System.out.println(changed); // Cześć, Olek!
        }
}
