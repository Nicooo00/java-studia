import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Podaj pierwsza liczbe:");
        double a = scanner.nextDouble();

        System.out.println("Podaj druga liczbe:");
        double b = scanner.nextDouble();

        System.out.println("Suma liczb to: " + (a + b));
        System.out.println("Roznica liczb to: " + (a - b));
        System.out.println("Iloczyn liczb to: " + (a * b));
        System.out.println("Iloraz liczb to: " + (a / b));
        scanner.close();

    }
}
//przy dzieleniu przez 0 wyskakuje blad, ale program sie nie konczy, 
// tylko wyswietla "Infinity" lub "-Infinity" w zaleznosci od znaku liczby.
