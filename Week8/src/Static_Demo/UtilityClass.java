package Static_Demo;

import java.util.Collections;

public class UtilityClass {

    public static String trim(String givenString){
        return givenString.trim();
    }

    public static int convertToInteger(String givenString){
        for (Character ch : givenString.toCharArray()){
            if (!Character.isDigit(ch)) return -1;
        }
        return Integer.parseInt(givenString);
    }
}
