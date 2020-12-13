package Cwiczenie8fix;

import java.security.SecureRandom;

public class Coin {

    public static int flip(){  //utworzenie metody flip
        SecureRandom random = new SecureRandom();   //implementacja klasy umozliwiajacej generowanie losowych liczb
        int n = random.nextInt(2);  //zadeklarowanie zmiennej int n, ktora bedzie losowo przyjmowac wartosc od 0 do 1.

        if( n == 1){   // jezeli n w wyniku operacji random przyjmie wartosc 1, to zostanie zwrocona informacja zwrotna w postaci "Wynik to reszka"
            System.out.println("Wynik to reszka");
        } else{
            System.out.println("Wynik to orzeł"); // wiemy, ze n przyjmie wartosc 0 lub 1, wiec jezeli dla 1 mamy juz opisane co mamy zrobic to dla 0, dajemy wyswietlenie"Wynik to orzel"
        }


        return n;  //zwracanie liczby, ktora wylosowal
    }
}
