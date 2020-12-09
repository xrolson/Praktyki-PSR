package Cwiczenie8;

import java.security.SecureRandom;

public class coin {

    int n;
    SecureRandom random;

    public coin(int n){
        this.n=n;
        random = new SecureRandom();
    }
    public int flip(){
        int value = this.random.nextInt(n) + 1;
        return value;
    }
}
