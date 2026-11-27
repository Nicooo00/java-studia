package lab6;

import java.util.Arrays;
import java.text.Collator;
import java.util.Locale;

class Dane3 implements Comparable<Dane3> {
    String nazwisko;

    @Override
    public int compareTo(Dane3 inna)
    {
        Collator collator = Collator.getInstance(Locale.forLanguageTag("pl-PL"));

        return collator.compare(inna.nazwisko, this.nazwisko);
    }
}

public class Zadanie3 {
    public static void main(String[] args)
    {
        Dane3[] informacje = new Dane3[3];

        for(int i = 0; i < informacje.length; i++)
        {
            informacje[i] = new Dane3();
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

        for(Dane3 informacja : informacje)
        {
            System.out.println(informacja.nazwisko);
        }
    }
}