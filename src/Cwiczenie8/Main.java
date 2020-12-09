package Cwiczenie8;



public class Main {
    public static void main(String[] args) {

        coin coin = new coin(2);
              if(coin.flip() == 1){
                  System.out.println("Wynik to reszka");
              }
              else{
                  System.out.println("wynik to orzeł");
              }


        }
    }
