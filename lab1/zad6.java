import java.util.Scanner;

public class zad6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Podaj x: " );
        double x = scanner.nextDouble();

        double[] wsp = {3, 2, 1, 4};
        
        double wielomianA = wsp[0] * Math.pow(x, 2) + wsp[1] * Math.pow(x, 1) + wsp[2];
        double wielomianB = wsp[0] * Math.pow(x, 3) + wsp[1] * Math.pow(x, 2) + wsp[2] * x + wsp[3];

        System.out.println("Wartość wielomianu A: " + wielomianA);
        System.out.println("Wartość wielomianu B: " + wielomianB);
        scanner.close();
    } 
}
