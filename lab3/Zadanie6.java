package lab3;

import java.util.Scanner;

public class Zadanie6 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj linie: ");
        String line = scanner.nextLine();
        line = line.trim();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ') {
                System.out.print(line.charAt(i));
            }
            else if (line.charAt(i) == ' ' && line.charAt(i + 1) != ' ')
            {
                System.out.println();
            }
            else
            {
                continue;
            }
        }
        scanner.close();
    }
}