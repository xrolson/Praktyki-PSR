package Cwiczenie5;

import java.util.Scanner;

public class Main {

    public static void miejscazerowe( double delta, double a, double b ){

        if(delta == 0) {
            System.out.println("Jedno rozwiazanie funkcji");
            double x0 = -b / (2 * a);
            System.out.println("x0 wynosi:" + x0);
        }else if (delta > 0){
            double x1 = (-b - Math.sqrt(delta)) /(2*a);
            double x2 = (-b + Math.sqrt(delta)) /(2*a);
            System.out.println("x1 i x2 wynosza:" + x1 +" "+ x2 + " delta wynosi:" + delta);
        } else {
            System.out.println("Brak rozwiazan");
        }
    }


    public static double obliczeniedelty(double a, double b, double c){
       double delta = b*b-4*a*c;
        return delta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby: a,b,c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = obliczeniedelty(a,b,c);
        miejscazerowe(delta,a,b);

        double delta1 = obliczeniedelty(a,b,c);
        miejscazerowe(delta1,a -2,b -3);

    }
}
