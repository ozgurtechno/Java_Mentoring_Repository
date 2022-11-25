package Week1_Algo;

import java.util.Locale;

public class CapitalizeFirstLetters {

    public static void main(String[] args) {

        String givenWord = "ali veli";

        // Sonuc A.V. seklinde ekrana yazdirilmali...
        int bosluk = givenWord.indexOf(" ");

        System.out.println(givenWord.substring(0,1).toUpperCase() + "." +
                givenWord.substring(bosluk + 1, bosluk + 2).toUpperCase() + ".");
















        int x =12;
        int y =6;

        if (x > y){
            System.out.println("X buyuktur");
        } else{
            System.out.println("Y buyuktur");
        }

        // 50 sayidan en buyuk olanini bulmak istesek?

        int biggestOne = Math.max(x,y);
        System.out.println("biggestOne = " + biggestOne);


    }
}
