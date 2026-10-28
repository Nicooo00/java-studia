package lab2;
import java.util.Scanner;
import java.util.Locale;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Podaj promien walca: ");
        double r = scanner.nextDouble();

        System.out.print("Podaj wysokosc walca: ");
        double h = scanner.nextDouble();

        if (r > 0 && h > 0) {
            double poleBoczne = 2 * Math.PI * r * h;
            double objetosc = Math.PI * r * r * h;

            System.out.println("Pole powierzchni bocznej: " + poleBoczne);
            System.out.println("Objetosc walca: " + objetosc);
        } else {
            System.out.println("Blad: promien i wysokosc musza byc wieksze od zera!");
        }

        scanner.close();
    }
}
