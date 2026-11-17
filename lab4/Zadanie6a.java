
package lab4;
import java.util.Scanner;

public class Zadanie6a {
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

            if (linia.contains(slowo)) {
                System.out.println(linia);
            }
        }

        scanner.close();
    }
}