import java.util.Scanner;

public class zad5 
{
    public static void main(String[] args)
 {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Podaj kąt:" );
    double kat = scanner.nextDouble();
    double radian = kat * Math.PI / 180;

    System.out.println("Kąt w radianach wynosi: " + radian);
    scanner.close();
 }    
}

