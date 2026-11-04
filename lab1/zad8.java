import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj promien walca: ");
        double r = scanner.nextDouble();

        System.out.print("Podaj wysokosc walca: ");
        double h = scanner.nextDouble();

        double poleBoczne = 2 * Math.PI * r * h;
        double objetosc = Math.PI * r * r * h;

        System.out.println("Pole powierzchni bocznej: " + poleBoczne);
        System.out.println("Objetosc walca: " + objetosc);

        scanner.close();
    }
}