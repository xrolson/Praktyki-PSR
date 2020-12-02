package Cwiczenia4;

public class Main {

  //  public static int rekur(int x){
   //     if (x>0){
 //          return rekur(x-1);
 //       }
//        return x;

 //   }

    public static int fibb(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        if (x > 1)
            return fibb(x - 1) + fibb(x - 2);
        else {
            return 0;
        }
    }
    public static float funkcja_kwadratowa(float x){
        return 2*x*x - 3*x +4;
    }

    public static void print_table(int[] ghf){
        for (int i=0; i< ghf.length; i++){
            System.out.println(ghf[i] +",");
        }

    }

    public static void main(String[] args) {
  //      System.out.println(funkcja_kwadratowa(5));

  //      int[] tab = {1,4,6,7,3,8,9,0,2,5};
    //    print_table(tab);

 //       for (int i=0; i< tab.length; i++);
  //          System.out.println();
  //      System.out.println((rekur(65)));
        System.out.println(fibb(9));
    }
}
