package lab2;
import java.util.Scanner;
import java.util.Locale;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Podaj wspolczynnik a: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj wspolczynnik b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double x = -b / a;

            System.out.println("Punkt przeciecia z osia OX: (" + x + ", 0)");
        } else {
            System.out.println("Blad: wspolczynnik a nie moze byc rowny zero!");
        }

        scanner.close();
    }
}
