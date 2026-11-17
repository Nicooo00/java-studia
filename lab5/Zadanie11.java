package lab5;

public class Zadanie11 {
        public static void sortuj(int[] tab) {

        for (int i = 1; i < tab.length; i++) {

            int liczba = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > liczba) {
                tab[j + 1] = tab[j];
                j--;
            }

            tab[j + 1] = liczba;
        }
    }

    public static void main(String[] args) {

        int[] tab = {5, 2, 8, 1, 3};

        sortuj(tab);

        for (int liczba : tab) {
            System.out.print(liczba + " ");
        }
    }
    
}
