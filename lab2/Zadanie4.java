package lab2;
import java.util.Scanner;
import java.util.Locale;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Podaj wspolczynnik a: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj wspolczynnik b: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj wspolczynnik c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double delta = b * b - 4 * a * c;

            System.out.println("Delta: " + delta);

            if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.println("Pierwszy pierwiastek: " + x1);
                System.out.println("Drugi pierwiastek: " + x2);

            } else if (delta == 0) {
                double x = -b / (2 * a);

                System.out.println("Jeden pierwiastek: " + x);

            } else {
                System.out.println("Brak pierwiastkow rzeczywistych.");
            }

        } else {
            System.out.println("Blad: wspolczynnik a nie moze byc rowny zero!");
        }

        scanner.close();
    }
}
