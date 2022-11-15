package Week1_Algo;

public class CapitalizeFirstLetters {

    public static void main(String[] args) {

        String givenWord = "Ali Veli";

        // Sonuc A.M. seklinde ekrana yazdirilmali...

        System.out.println(givenWord.charAt(0) + "." + givenWord.charAt(givenWord.indexOf(" ") + 1 ) + ".");
    }
}
