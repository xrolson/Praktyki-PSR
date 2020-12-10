package Cwiczenie8fix;

import java.security.SecureRandom;

public class Coin {

    public static int flip(){
        SecureRandom random = new SecureRandom();
        int n = random.nextInt(2);

        if( n == 1){
            System.out.println("Wynik to reszka");
        } else{
            System.out.println("Wynik to orzeł");
        }


        return n;
    }
}
