package SoruCozumleri;

public class StringMethods {

    public static void main(String[] args) {

        // Verilen bir String i tersine ceviriniz...

        String str= "Techno", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Techno"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }

}
