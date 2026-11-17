package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Zadanie5 {

    static void sortowanie(int[] tablica)
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

            for (int i = 0; i < tablica.length; i++)
            {
                System.out.printf("%4d",tablica[i]);
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
                System.out.println("Bład: " + i.getMessage());
            }
        }

        int[] liczby = new int [n];
  
        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj liczbe: ");
            liczby[i] = scanner.nextInt();
        }

        scanner.close();

        sortowanie(liczby);
    }
    
}



