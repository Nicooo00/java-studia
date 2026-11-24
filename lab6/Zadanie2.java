package lab6;

import java.util.Arrays;

class Dane2 implements Comparable<Dane2> {
    String nazwisko;

    @Override
    public int compareTo(Dane2 inna) {
        return this.nazwisko.compareTo(inna.nazwisko);
    }
}

public class Zadanie2 {
    public static void main(String[] args)
    {
        Dane2[] informacje = new Dane2[3];

        for(int i = 0; i < informacje.length; i++)
        {
            informacje[i] = new Dane2();
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

        for(Dane2 informacja : informacje)
        {
            System.out.println(informacja.nazwisko);
        }
    }
}
