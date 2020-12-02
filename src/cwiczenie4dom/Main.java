package cwiczenie4dom;

public class Main {
    public static void suma(int[] tab){
        for (int i=0; i< tab.length; i++){
            System.out.println(tab[i] +",");
        }
    }

//    public static int funkcja1 (int x){
//        if ( x%2 == 0 ) return 0;
//        else{
//            return 0;
//        }
//
//    }

    public static void main(String[] args) {
        int[] tab = {1,4,6,7,3,8,9,0,2,5};
        suma(tab);
    }
}
