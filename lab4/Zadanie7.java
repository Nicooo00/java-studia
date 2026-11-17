package lab4;

public class Zadanie7 {
    public static void main(String[] args)
    {
        int los;
        int i = 0;
        int j = 0;
        while(i < 100)
        {
            los = (int) (Math.random() * 100);
            i += 1;
            if (los < 20)
            {
                System.out.println(los);
                j += 1;
            }

            if(j >= 10)
            {
                System.out.println("Udalo sie wylosowac 10 takich liczb!");
                System.out.print("Licznik: " + i);
                break;
            }
        }
    }

}
