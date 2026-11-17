package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie7
{
    static void sortowanie(int[] tablica, boolean condition)
    {
            int x;
            for(int j = 0; j < tablica.length-1; j++)
            {
                for(int i = 0; i < tablica.length-1; i++)
                {
                    if(tablica[i] > tablica[i+1])
                    {
                        x = tablica[i+1];
                        tablica[i+1] = tablica[i];
                        tablica[i] = x;
                    }
                }
            }

            if(condition)
            {
                for (int i = tablica.length - 1; i >= 0; i--)
                {
                    System.out.printf("%4d",tablica[i]);
                }
            }
            else
            {
                for (int i = 0; i < tablica.length; i++)
                {
                    System.out.printf("%4d",tablica[i]);
                }
            }
            System.out.println();

    }
    public static void main(String[] args) throws FileNotFoundException
    {
        File plik = new File("lab5/dane.txt");

        Scanner scanner = new Scanner(plik);

        String linia;
        int number;
        int counter = 0;

        while(scanner.hasNextLine())
        {
            linia = scanner.nextLine();
            try
            {
                number = Integer.parseInt(linia);
                counter += 1;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Niepoprawna liczba!");
            }
        }

        int[] liczby = new int[counter];

        Scanner scanner2 = new Scanner(plik);

        int counter2 = 0;

        while(scanner2.hasNextLine())
        {
            linia = scanner2.nextLine();
            try
            {
                number = Integer.parseInt(linia);
                liczby[counter2] = number;
                counter2 += 1;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Zle dane w linii");
            }
        }

        sortowanie(liczby, false);

        scanner.close();
        scanner2.close();
    }
}