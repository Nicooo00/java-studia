package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidSizeException extends RuntimeException {
    
    // Konstruktor domyślny
    public InvalidSizeException() {
        super();
    }

    // Konstruktor przyjmujący wiadomość o błędzie
    public InvalidSizeException(String message) {
        super(message);
    }
}

public class Zadanie3 {
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
