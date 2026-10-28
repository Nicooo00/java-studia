package lab3;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj linie: ");
        String line = scanner.nextLine();

        int liczbaA = line.length() - line.replace("a", "").length();

        System.out.println("Liczba liter a: " + liczbaA);
        scanner.close();
    }
}
