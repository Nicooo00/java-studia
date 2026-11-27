package lab6;

import java.util.Arrays;
import java.text.Collator;
import java.util.Locale;

class Ksiazka implements Comparable<Ksiazka> 
{
    String tytul;
    String autor;
    int rok;

    @Override
    public int compareTo(Ksiazka inna) 
    {
        Collator collator = Collator.getInstance(Locale.forLanguageTag("pl-PL"));

        return collator.compare(inna.tytul, this.tytul);
    }
}

public class Zadanie5_6 {
    public static void main(String[] args) {

        Ksiazka[] ksiazki = new Ksiazka[4];

        for (int i = 0; i < ksiazki.length; i++)
        {
            ksiazki[i] = new Ksiazka();
        }

        ksiazki[0].tytul = "Wiedzmin";
        ksiazki[0].autor = "Andrzej Sapkowski";
        ksiazki[0].rok = 1990;

        ksiazki[1].tytul = "Hobbit";
        ksiazki[1].autor = "J.R.R. Tolkien";
        ksiazki[1].rok = 1937;

        ksiazki[2].tytul = "Lalka";
        ksiazki[2].autor = "Boleslaw Prus";
        ksiazki[2].rok = 1890;

        ksiazki[3].tytul = "Dziady";
        ksiazki[3].autor = "Adam Mickiewicz";
        ksiazki[3].rok = 1823;

        Arrays.sort(ksiazki);

        for (Ksiazka k : ksiazki)
        {
            System.out.println(k.tytul + " - " + k.autor + " (" + k.rok + ")");
        }
    }
}