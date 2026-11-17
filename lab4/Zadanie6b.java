package lab4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zadanie6b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj slowo: ");
        String slowo = scanner.next();
        scanner.nextLine();

        System.out.println("Wpisuj tekst:");

        while (true) {
            String linia = scanner.nextLine();

            if (linia.isEmpty()) {
                break;
            }

            if (Pattern.compile(Pattern.quote(slowo)).matcher(linia).find()) {
                System.out.println(linia);
            }
        }

        scanner.close();
    }
}