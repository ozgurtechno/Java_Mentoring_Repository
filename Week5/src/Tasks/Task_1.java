package Tasks;

public class Task_1 {

    public static void main(String[] args) {

        // Write a method which reverse a given String

        String str= "Techno", reversed="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Techno"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            reversed= ch+reversed; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ reversed);

    }
}
