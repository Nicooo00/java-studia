package lab3;

import java.util.Scanner;

public class Zadanie3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj linie: ");
        String line = scanner.nextLine();

        line = line.replaceAll("\\s+", " ");
        System.out.println(line);

        scanner.close();
        }
}
