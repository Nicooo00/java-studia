package lab2;
import java.util.Scanner;
import java.util.Locale;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Podaj pierwsza liczbe: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj druga liczbe: ");
        double b = scanner.nextDouble();

        double suma = a + b;
        System.out.println("Suma: " + suma);

        if (b != 0) {
            double iloraz = a / b;
            System.out.println("Iloraz: " + iloraz);
        } else {
            System.out.println("Nie mozna dzielic przez zero!");
        }

        // Podpunkt a
        System.out.println("\nPodpunkt a:");
        double duza = 1e308;
        double mala = 1e-10;
        System.out.println("Wynik dzielenia: " + (duza / mala));

        // Podpunkt b
        System.out.println("\nPodpunkt b:");
        double wynik = 1.0 + 1e-20;
        System.out.println("1 + 1e-20 = " + wynik);

        scanner.close();
    }
}
