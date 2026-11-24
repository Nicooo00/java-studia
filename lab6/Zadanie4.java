package lab6;

import java.util.Arrays;

class Pracownik implements Comparable<Pracownik> {
    int id;
    String nazwisko;
    String stanowisko;

    @Override
    public int compareTo(Pracownik inny) {
        int wynik = this.stanowisko.compareTo(inny.stanowisko);

        if (wynik == 0)
        {
            return this.nazwisko.compareTo(inny.nazwisko);
        }

        return wynik;
    }
}

public class Zadanie4 {
    public static void main(String[] args) {

        Pracownik[] pracownicy = new Pracownik[5];

        for (int i = 0; i < pracownicy.length; i++)
        {
            pracownicy[i] = new Pracownik();
        }

        pracownicy[0].id = 1;
        pracownicy[0].nazwisko = "Kowalski";
        pracownicy[0].stanowisko = "Programista";

        pracownicy[1].id = 2;
        pracownicy[1].nazwisko = "Nowak";
        pracownicy[1].stanowisko = "Kierownik";

        pracownicy[2].id = 3;
        pracownicy[2].nazwisko = "Adamski";
        pracownicy[2].stanowisko = "Programista";

        pracownicy[3].id = 4;
        pracownicy[3].nazwisko = "Wisniewski";
        pracownicy[3].stanowisko = "Analityk";

        pracownicy[4].id = 5;
        pracownicy[4].nazwisko = "Baran";
        pracownicy[4].stanowisko = "Kierownik";

        Arrays.sort(pracownicy);

        for (Pracownik p : pracownicy)
        {
            System.out.println(p.id + " " + p.nazwisko + " " + p.stanowisko);
        }
    }
}