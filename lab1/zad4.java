import java.util.Scanner;

public class zad4 
{
    public static void main(String[] args)
 {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Podaj promień koła:" );
    double r = scanner.nextDouble();
    double pole = Math.PI * r * r;

    System.out.println("Pole koła wynosi: " + pole);
    scanner.close();
 }    
}
