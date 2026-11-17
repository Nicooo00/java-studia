package lab4;

public class Zadanie9 {

    public static int pozycja(char znak, char[] alfabet) {
        for (int i = 0; i < alfabet.length; i++) {
            if (alfabet[i] == znak) {
                return i / 2;
            }
        }
        return -1;
    }

    public static int porownaj(String a, String b, char[] alfabet) {
        int n = Math.min(a.length(), b.length());

        for (int i = 0; i < n; i++) {
            int x = pozycja(a.charAt(i), alfabet);
            int y = pozycja(b.charAt(i), alfabet);

            if (x != y) {
                return x - y;
            }
        }

        return a.length() - b.length();
    }

    public static void main(String[] args) {

        char[] litery = new char[26];

        for (int i = 0; i < 26; i++) {
            litery[i] = (char) ('a' + i);
        }

        for (int i = 25; i >= 0; i--) {
            System.out.print(litery[i] + " ");
        }

        System.out.println();


        char[] polski = "aAąĄbBcCćĆdDeEęĘfFgGhHiIjJkKlLłŁmMnNńŃoOóÓpPrRsSśŚtTuUwWyYzZźŹżŻ".toCharArray();

        String[] slowa = {"Żaba", "Zebra", "Ćma", "Ala", "Łódź", "Ącki"};

        for (int i = 0; i < slowa.length - 1; i++) {
            for (int j = 0; j < slowa.length - 1 - i; j++) {

                if (porownaj(slowa[j], slowa[j + 1], polski) > 0) {
                    String temp = slowa[j];
                    slowa[j] = slowa[j + 1];
                    slowa[j + 1] = temp;
                }
            }
        }

        System.out.println("Posortowane slowa:");

        for (String slowo : slowa) {
            System.out.println(slowo);
        }
    }
}