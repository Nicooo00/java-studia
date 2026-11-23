package lab6;

import java.util.Arrays;

class Dane implements Comparable<Dane> {
    String nazwisko;

    @Override
    public int compareTo(Dane inna) {
        return this.nazwisko.compareTo(inna.nazwisko);
    }
}

public class Zadanie2 {
    public static void main(String[] args)
    {
        Dane[] informacje = new Dane[3];

        for(int i = 0; i < informacje.length; i++)
        {
            informacje[i] = new Dane();
        }

        informacje[0].nazwisko = "Kowalski";
        informacje[1].nazwisko = "Nowak";
        informacje[2].nazwisko = "Adamski";

        System.out.println();

        for(int i = 0; i < informacje.length; i++)
        {
            System.out.println("Nazwisko: " + informacje[i].nazwisko);
        }

        Arrays.sort(informacje);

        for(Dane informacja : informacje)
        {
            System.out.println(informacja.nazwisko);
        }
    }
}
