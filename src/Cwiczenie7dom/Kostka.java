package Cwiczenie7dom;
import java.security.SecureRandom;
import java.util.Random;

public class Kostka {

    int n;    // zadeklarowanie zmienej n
    SecureRandom random;  // implementacja secure random

    public Kostka(int n){   //klasa kostka, ktora operuje na zmiennej n
        this.n=n;  //obiekt n w klasie kostka
        random = new SecureRandom();  // implementacja secure random w klasie kostka
    }
    public int roll(){  //klasa roll
        int value = this.random.nextInt(n) + 1; // zmienna value, ktora bierze losowa liczbe z n z klasy kostka i dodaje 1
        return value; //zwraca value
    }

}