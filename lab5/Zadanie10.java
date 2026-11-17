package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie10 {
    static void insertion_sort(int[] tablica)
    {
        int pomocnicza = 0;
        for(int j = 1; j < tablica.length; j++)
        {
            for(int i = j; i >= 1; i--)
            {
                if(tablica[i] < tablica[i-1])
                {
                    pomocnicza = tablica[i];
                    tablica[i] = tablica[i-1];
                    tablica[i-1] = pomocnicza;
                }
                else
                {
                    break;
                }
            }
        }

        for(int i = 0; i < tablica.length; i++)
        {
            System.out.printf("%4d", tablica[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true)
        {
            System.out.print("Podaj rozmiar macierzy: ");
            try
            {
                n = scanner.nextInt();
                if (n <= 0) 
                {
                    throw new InvalidSizeException("Rozmiar nie może być ujemny!");
                }
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Podano zly input!");
                scanner.next();
            }
            catch(InvalidSizeException i)
            {
                System.out.print("Bład: " + i.getMessage());
            }
        }

        int[] liczby = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj liczbe: ");
            liczby[i] = scanner.nextInt();
        }

        insertion_sort(liczby);

        scanner.close();
    }
}
