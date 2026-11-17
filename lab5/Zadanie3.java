package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        while(n <= 0)
        {
            try
                {
                System.out.println("Nieprawidlowy rozmiar!");
                System.out.print("Podaj rozmiar tablicy: ");
                n = scanner.nextInt();
                }
            catch(InputMismatchException i)
                {
                    System.out.print("nie podano dodatniej cyfry");
                }
        }

        int[] liczby = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj liczbe: ");
            liczby[i] = scanner.nextInt();
        }

        System.out.println("Utworzona macierz: ");

        for(int i = 0; i < n; i++)
        {  
            System.out.printf("%4d", liczby[i]);
        }

        System.out.println();

        int najmniejsza = liczby[0];
        int najwieksza = liczby[0];
        
        for(int i = 0; i < n-1; i++)
        {
            if(najmniejsza > liczby[i+1])
                {
                    najmniejsza = liczby[i+1];
                }
            else if(najwieksza < liczby[i+1])
                {
                    najwieksza = liczby[i+1];
                }
        }

        System.out.println("Najwieksza liczba: " + najwieksza);
        System.out.println("Najmniejsza liczba: " + najmniejsza);

        scanner.close();

    }
}
