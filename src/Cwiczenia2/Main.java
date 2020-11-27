package Cwiczenia2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Zadanie: posortowanie tablicy liczb całkowitych rosnaco
        int[] tab = {1, 6, 32, 5, 2, 34, 21, 76};
        int[] wynik = new int[tab.length];

        //przechodzimy po kazdym elemencie tablicy wynik
        for (int j = 0; j < wynik.length; j++) ;
        {

            // petla przechodzaca po wszystkich elementach tablicy
            int temp = tab[0];
            int lokalizacja = 0;
            for (int i = 1; i <= tab.length; i++) {
                //Porownaj przechowywana zmienna z kolejnym jej miejscem
                if (temp > tab[i]) {
                    temp = tab[i];
                    lokalizacja = i;
                }
                System.out.println("temp:" + temp + " lokalizacja:" + lokalizacja);
            }
            //Wpisujemy do konkretnego miejsca w tablicy nasza wartosc oraz ustalamy wartosc is null

            int j =0;
            wynik[j] = temp;
            tab[lokalizacja] = Integer.MAX_VALUE;

            System.out.print(wynik[j] + ",");
        }
    }
}