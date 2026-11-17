package lab4;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj date (DD.MM.RRRR): ");
        String data = scanner.nextLine();

        if (data.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            System.out.println("Poprawny format daty");
        } else {
            System.out.println("Niepoprawny format daty");
        }

        scanner.close();
    }
}