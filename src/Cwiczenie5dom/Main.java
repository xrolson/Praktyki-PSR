package Cwiczenie5dom;

import java.util.Scanner;


public class Main {

    public static double obliczenie( double a, double b, double x){
     double y = a*x+b;
     return y;
    }

    public static void miejscazerowe (double a, double b){
        if( a != 0){
            System.out.println("Zaraz ci podam miejsce zerowe!! :----D");
           double x0 = -b/a;
            System.out.println("Miejsce zerowe to:" + x0);}
            else if ( a == 0 ) {
            System.out.println("Brak miejsc zerowych");
        }

            }






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosci zmiennych 'a' i 'b' ");
        double a = scanner.nextFloat();
        double b = scanner.nextFloat();
        double x = 0;

        double y = obliczenie(a,b,x);
        miejscazerowe(a,b);
    }
}
