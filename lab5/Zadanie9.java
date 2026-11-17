package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

class Algorithm9
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

    int indexMaxInRange(int[] tablica,int iMin,int iMax)
    {
        int index_maksymalny = iMin;
        for(int i = iMin; i < iMax; i++)
        {
            if(tablica[index_maksymalny] < tablica[i + 1])
            {
                index_maksymalny = i + 1;
            }
        }
        return index_maksymalny;
    }

    void sortByMaxIndex(int[] tablica, int iMin, int iMax)
    {
        int index_maksymalny = iMin;
        int pomocnicza = 0;

        for(int j = iMax; j > iMin; j--)
        {
            index_maksymalny = iMin;
            for(int i = iMin; i < j; i++)
            {
                if(tablica[index_maksymalny] < tablica[i + 1])
                {
                    index_maksymalny = i + 1;
                }
            }
            pomocnicza = tablica[j];
            tablica[j] = tablica[index_maksymalny];
            tablica[index_maksymalny] = pomocnicza;
        }

        for(int i = iMin; i <= iMax; i++)
        {
            System.out.printf("%4d", tablica[i]);
        }

    }
}

public class Zadanie9 {

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


        Algorithm9 algorithm = new Algorithm9();
        
        algorithm.sortByMaxIndex(liczby, 2, 5);

        scanner.close();
    }   
}
