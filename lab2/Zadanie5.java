package lab2;
import java.util.Scanner;
import java.util.Locale;

class Algorytm {

    public static void rozwiazUklad(double a11, double a12,
                                    double a21, double a22,
                                    double b1, double b2) {

        double W = a11 * a22 - a12 * a21;
        double W1 = b1 * a22 - a12 * b2;
        double W2 = a11 * b2 - b1 * a21;

        System.out.println("Wyznacznik W = " + W);
        System.out.println("Wyznacznik W1 = " + W1);
        System.out.println("Wyznacznik W2 = " + W2);

        if (W != 0) {
            double x1 = W1 / W;
            double x2 = W2 / W;

            System.out.println("Rozwiazanie ukladu:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (W1 == 0 && W2 == 0) {
            System.out.println("Uklad ma nieskonczenie wiele rozwiazan.");

        } else {
            System.out.println("Uklad nie ma rozwiazan.");
        }
    }
}

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Podaj a11: ");
        double a11 = scanner.nextDouble();

        System.out.print("Podaj a12: ");
        double a12 = scanner.nextDouble();

        System.out.print("Podaj a21: ");
        double a21 = scanner.nextDouble();

        System.out.print("Podaj a22: ");
        double a22 = scanner.nextDouble();

        System.out.print("Podaj b1: ");
        double b1 = scanner.nextDouble();

        System.out.print("Podaj b2: ");
        double b2 = scanner.nextDouble();

        Algorytm.rozwiazUklad(a11, a12, a21, a22, b1, b2);

        scanner.close();
    }
}
