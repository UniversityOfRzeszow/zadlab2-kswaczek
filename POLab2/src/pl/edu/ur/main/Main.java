package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7

        //zad 3   
        System.out.println("\n-------------------ZADANIE 3------------------------");
        int z;
        int[] tablica = new int[10];
        System.out.print("Podaj 10 liczb: ");
        Scanner odczyt = new Scanner(System.in);

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = odczyt.nextInt();
        }

        System.out.println("Wybierz:\n"
                + "1.Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n"
                + "2.Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n"
                + "3.Wyświetlanie elementów o nieparzystych indeksach.\n"
                + "4.Wyświetlanie elementów o parzystych indeksach.");
        Scanner odczyt2 = new Scanner(System.in);
        z = odczyt2.nextInt();

        if (z == 1) {
            System.out.print("1. ");
            for (int i = 0; i < tablica.length; i++) {

                System.out.print(tablica[i]);
            }
        } else if (z == 2) {

            System.out.print("2. ");
            for (int i = 9; i >= 0; i--) {

                System.out.print(tablica[i]);
            }
        } else if (z == 3) {

            System.out.print("3. ");
            for (int i = 1; i < tablica.length; i += 2) {

                System.out.print(tablica[i]);
            }
        } else if (z == 4) {

            System.out.print("4. ");
            for (int i = 0; i < tablica.length; i += 2) {

                System.out.print(tablica[i]);
            }
        } else {
            System.out.println("Zły wybór");
        }
        System.out.println("\n-------------------ZADANIE 4------------------------");
        // zad 4
        int p;
        int wynik = 0;
        int iloczyn = 1;
        int[] tab = new int[10];

        System.out.print("\nPodaj 10 liczb: ");
        Scanner odczyt3 = new Scanner(System.in);

        for (int j = 0; j < tab.length; j++) {
            tab[j] = odczyt3.nextInt();
        }

        System.out.println("Wybierz:\n"
                + "1.Oblicz sumę elementów tablicy\n"
                + "2.Oblicz iloczyn elementów tablicy\n"
                + "3.Wyznacz wartość średnią\n"
                + "4.Wyznacz wartość minimalną\n"
                + "5.Wyznacz wartość maksymalną.");
        Scanner odczyt4 = new Scanner(System.in);
        p = odczyt4.nextInt();

        if (p == 1) {
            System.out.print("Suma= ");
            for (int j = 0; j < tab.length; j++) {
                wynik = wynik + tab[j];

            }
            System.out.print(wynik);
        } else if (p == 2) {
            System.out.print("Iloczyn= ");
            for (int j = 0; j < tab.length; j++) {
                iloczyn = iloczyn * tab[j];

            }
            System.out.print(iloczyn);
        } else if (p == 3) {
            System.out.print("Średnia= ");
            for (int j = 0; j < tab.length; j++) {
                wynik = wynik + tab[j];

            }
            System.out.print(wynik / 10);
        } else if (p == 4) {
            int min = tab[0];
            System.out.print("Min= ");
            for (int j = 0; j < tab.length; j++) {
                if (min > tab[j]) {
                    min = tab[j];
                }
            }
            System.out.print(min);
        } else if (p == 5) {
            int max = tab[0];
            System.out.print("Max= ");
            for (int j = 0; j < tab.length; j++) {
                if (tab[j] > max) {
                    max = tab[j];
                }
            }
            System.out.print(max);
        } else {
            System.out.println("Zły wybór");

        }
        System.out.println("\n-------------------ZADANIE 6------------------------");
        //zad 6

        Scanner scanner = new Scanner(System.in);
        int a;

        while (true) {
            System.out.println("Podaj liczbę: ");
            a = scanner.nextInt();
            if (a > 0) {

            } else if (a < 0) {
                break;

            }
        }
        
        //zad 7
        System.out.println("\n-------------------ZADANIE 7------------------------");
        
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę elementów tablicy: ");
        int w = in.nextInt();
        int[] sort = new int[w];

        System.out.format("Podaj elementy tablicy: ");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = in.nextInt();
        }

        System.out.println("Posortowana tablica: ");
        for (int j = 0; j < sort.length; j++) {
            for (int i = 0; i < sort.length - 1 - j; i++) {
                if (sort[i] > sort[i + 1]) {

                    int x = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = x;

                }
            }
        }
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + "");
        }
        System.out.println();
        
    }
}
