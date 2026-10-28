package lab3;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      
       System.out.print("Podaj linie: ");
       String line = scanner.nextLine();
       if (line.equalsIgnoreCase("exit")) {
           break;
       }
       
    }
    scanner.close();
}
}