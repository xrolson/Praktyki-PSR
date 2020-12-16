package Cwiczenia11;

public class Caesar {



            // Metoda dla szyfrowania tekstu i utworzenie zmiennej do ilosci przeskokow liter(shift)
    public static String encrypt(String Text, int shift){

            //Okreslenie wartosci zmiennej shift od 1 do 26 dla kazdej litery alfabetu
        if(shift>26){
            shift=shift%26;
        }else if(shift<0) {
            shift = (shift % 26) + 26;
        }

        String cipherText = "";

            //Odczytanie dlugosci tekstu
        int length = Text.length();

            //Utworzenie petli przechodzacej przez wszystkie litery
        for(int i = 0; i <Text.length(); i++){

            //Znak brany jest z iteracji i
        char ch = Text.charAt(i);
            //Upewnienie sie czy znak to litera
        if(Character.isLetter(ch)){
            //Upewnienie sie czy litera jest mala czy duza
            if(Character.isLowerCase(ch)){
            char c =(char)(ch+shift);
            if(c>'z'){
                cipherText += (char)(ch - (26-shift));
            }
            else{
                cipherText += c;
            }
            }else if(Character.isUpperCase(ch)){
                char c =(char)(ch+shift);
                if(c>'Z'){
                    cipherText += (char)(ch - (26-shift));
                }
                else{
                    cipherText += c;
                }
            }

        }else{
            //Jezeli nie jest to litera, zostanie dodana w tej samej postaci
            cipherText += ch;
        }
        }
            //Zwrocenie koncowej wiadomosci
        return cipherText;
    }


    public static void main(String[] args) {

            //String z tekstem ktory zostanie zaszyfrowany, string okreslajacy szyfrowanie, czyli co ma zaszyfrowac oraz wartosc shift, okreslajaca o ile liter ma przeskakiwac oraz pokazanie tekstu zaszyfrowanego
        String text = "Random text here";
        String cypher = encrypt(text, 3);
        System.out.println(cypher);

    }
}
