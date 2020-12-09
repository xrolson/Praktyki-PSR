package Cwiczenie7dom;
import java.security.SecureRandom;
import java.util.Random;

public class Kostka {

    int n;
    SecureRandom random;

    public Kostka(int n){
        this.n=n;
        random = new SecureRandom();
    }
    public int roll(){
        int value = this.random.nextInt(n) + 1;
        return value;
    }

}