package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

class Algorithm
{
    int indexMin(int[] tablica)
    {
        int min_index = 0;
        for(int i = 0; i < tablica.length-1; i++)
        {
            if(tablica[min_index] > tablica[i+1])
            {
                min_index = i + 1;
            }
        }
        return min_index;
    }

    double average(int[] tablica)
    {
        double srednia = 0;
        double suma = 0;

        for(int i = 0; i < tablica.length; i++)
        {
            suma += tablica[i];
        }

        srednia = suma / tablica.length;

        return srednia;
    }
}

public class Zadanie4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();
        
        while(n <= 0)
        {
            try
            {
                System.out.println("Podano nieprawidlowy rozmiar!");
                System.out.print("Podaj rozmiar tablicy: ");
                n = scanner.nextInt();
            }
            catch(InputMismatchException i)
            {
                System.out.print("Podano zly rozmiar");
            }
        }
        
        int[] liczby = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj liczbe: ");
            liczby[i] = scanner.nextInt();
        }

        System.out.println("Otrzymana macierz:");

        for(int i = 0; i < n; i++)
        {
            System.out.printf("%4d",liczby[i]);
        }

        scanner.close();

        Algorithm alg = new Algorithm();

        System.out.println();
        System.out.println("Najmniejszy indeks: " + alg.indexMin(liczby));
        System.out.println("Srednia arytmetyczna: " + alg.average(liczby));

    }
}
