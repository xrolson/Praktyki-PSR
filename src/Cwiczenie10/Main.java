package Cwiczenie10;

public class Main {
    public static void main(String[] args) {

        int[] tab = {2,5,7,3,2,12,76,98,43,2,6};
        int suma = 0;
        float s;
        for(int i = 0; i < tab.length; i++){
            suma+=tab[i];


        }s = suma/ tab.length;
        System.out.println("Srednia wynosi" + s);

    }


}
