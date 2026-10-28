package lab2;
import java.util.Scanner;
import java.util.Locale;

public class Zadanie6 {

    static class Algorytm {

        // Obliczanie wyznacznika macierzy 3x3
        public static double wyznacznik(double[][] a) {
            return a[0][0] * (a[1][1] * a[2][2] - a[1][2] * a[2][1])
                 - a[0][1] * (a[1][0] * a[2][2] - a[1][2] * a[2][0])
                 + a[0][2] * (a[1][0] * a[2][1] - a[1][1] * a[2][0]);
        }

        public static void rozwiazUklad(double[][] a, double[] b) {

            double W = wyznacznik(a);
            System.out.println("Wyznacznik W = " + W);

            if (W == 0) {
                System.out.println("Uklad nie ma jednoznacznego rozwiazania.");
                return;
            }

            double[] wyniki = new double[3];

            for (int k = 0; k < 3; k++) {

                double[][] temp = new double[3][3];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (j == k) {
                            temp[i][j] = b[i];
                        } else {
                            temp[i][j] = a[i][j];
                        }
                    }
                }

                double Wk = wyznacznik(temp);
                System.out.println("Wyznacznik W" + (k + 1) + " = " + Wk);

                wyniki[k] = Wk / W;
            }

            System.out.println("Rozwiazanie ukladu:");
            System.out.println("x1 = " + wyniki[0]);
            System.out.println("x2 = " + wyniki[1]);
            System.out.println("x3 = " + wyniki[2]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[][] a = new double[3][3];
        double[] b = new double[3];

        // Wczytywanie wspolczynnikow macierzy
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Podaj a" + (i + 1) + (j + 1) + ": ");
                a[i][j] = scanner.nextDouble();
            }
        }

        // Wczytywanie wyrazow wolnych
        for (int i = 0; i < 3; i++) {
            System.out.print("Podaj b" + (i + 1) + ": ");
            b[i] = scanner.nextDouble();
        }

        Algorytm.rozwiazUklad(a, b);

        scanner.close();
    }
}
