package lab3;

import java.util.Scanner;

public class Zadanie7 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj linie: ");
        String line = scanner.nextLine();

        int i = 0;

        while (i < line.length()) {
            if (line.charAt(i) == ' ' || line.charAt(i) == '\t') {
                i++;
            } else {
                break;
            }
        }
  
        line = line.substring(i);
        System.out.println(line);


        scanner.close();
}
}