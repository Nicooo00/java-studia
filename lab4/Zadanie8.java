package lab4;

public class Zadanie8 {
    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 10; j < 10 + i*2; j += 2)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    
}
