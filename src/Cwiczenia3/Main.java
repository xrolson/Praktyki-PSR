package Cwiczenia3;

public class Main {
    public static void main(String[] args) {
        int liczby[] = {67, 123, 753, 873, 845, 62, 11, 8, 7623, 438};
        int suma = 0;

        for(int i = 0; i < liczby.length; i++) {
            suma+=liczby[i];

        }
        System.out.println("Suma liczb w tabeli wynosi:" + suma);
    }
}
