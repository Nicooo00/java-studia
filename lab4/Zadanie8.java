package lab4;

public class Zadanie8 {
    public static void main(String[] args)
    {
        int x = 10;

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 0; j < i;j++)
            {
                System.out.print(x + " ");
                x += 2;
            }
            System.out.println();
        }

    }
    
}
