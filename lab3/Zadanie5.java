package lab3;

import java.util.Scanner;

public class Zadanie5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj linie: ");
        String line = scanner.nextLine();
        
        int slowa = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ' &&
                (i == 0 || line.charAt(i - 1) == ' ')) {
                slowa++;
            }
        }
        System.out.println("Liczba słów: " + (slowa));
        scanner.close();
        }
}
