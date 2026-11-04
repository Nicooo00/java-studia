import java.util.Scanner;

public class zad7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Podaj x: " );
        double x = scanner.nextDouble();

        double[] wspA = {1,2,3};

        int n = wspA.length - 1;
        double y = wspA[n];
        for (int i = n-1; i >= 0; i--) 
            {
                y = wspA[i] + y * x;
            }

        
        double[] wspB = {4,1,2,3};

        int n2 = wspB.length - 1;
        double y2 = wspB[n2];
        for (int i = n2-1; i >= 0; i--) 
            {
                y2 = wspB[i] + y2 * x;
            }

        System.out.println("Wartość wielomianu A: " + y);
        System.out.println("Wartość wi1elomianu B: " + y);
        scanner.close();
    } 
}