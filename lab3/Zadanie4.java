package lab3;

import java.util.Scanner;

public class Zadanie4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj linie: ");
        String line = scanner.nextLine();

        int licznik = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == 'a' && i + 1 < line.length() && line.charAt(i + 1) == 'b') {
                licznik++;
            }
        }
        System.out.println("Liczba wystąpień sekwencji 'ab': " + licznik);
        scanner.close();
    }
}
