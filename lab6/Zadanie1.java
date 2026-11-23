package lab6;

class Dane
{
    String imie;
    String nazwisko;
    String numer;
}

public class Zadanie1 {
    public static void main(String[] args)
    {
        Dane telefon = new Dane();

        telefon.imie = "Mikolaj";
        telefon.nazwisko = "Szczepaniak";
        telefon.numer = "534-234-452";

        System.out.println("Imie w telefonie: " + telefon.imie);
        System.out.println("Nazwisko w telefonie: " + telefon.nazwisko);
        System.out.println("Numer telefonie: " + telefon.numer);
    }
}
