package Cwiczenie9;

public class Main {
    public static void main(String[] args) {

        int[]tab = { 1, 732, 5754, 43, 9, 21, 54, 742, 972, 10006};
        int n;
        n = tab[0];


        for(int i = 0; i < tab.length; i++){
            if (n < tab[i]){
                n = tab[i];
            }
        }
        System.out.println(n);
    }
}
