package lab4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Wprowadz tekst:");

        String text = reader.readLine().trim();
        String[] words = text.split("\\s+");

        System.out.println(words.length);
}
}