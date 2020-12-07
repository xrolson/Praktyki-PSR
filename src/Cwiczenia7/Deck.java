package Cwiczenia7;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> deck;

    public Deck(){

        deck = new ArrayList<>();
        String[] colors = { "Kier", "Karo", "Trefl", "Pik"};
        String symbol;

        for(String color: colors){
            for (int i=2; i<14; i++){
                switch (i){
                    case 11: symbol="J"; break;
                    case 12: symbol="Q"; break;
                    case 13: symbol="K"; break;
                    case 14: symbol="A"; break;
                    default: symbol=Integer.toString(i);
                }
                Card card = new Card(color, i,symbol );
                deck.add(card);
            }
        }

      //  public Card draw(){

            SecureRandom random = new SecureRandom();

            int index = random.nextInt(52);

            Card card = deck.get(index);
            deck.remove(index);

        //    return card;
        }


    }

//}
