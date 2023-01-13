package final_Keyword;

public class final_Demo{

    public static void main(String[] args) {

        String example = "String bir Final Class dir... Immutable";
        String word = "adada";
        String word3 = "adada";
        System.out.println(word == word3);
        String word2 = new String("adada");
        System.out.println(word.equals(word2));
        example = "yeni kelime";
        System.out.println(example); // Final Class

        // Primitive data
        final int MAX_NUMBER = 12;
        //MAX_NUMBER = 13;


        // Reference Type
        final Cat cat = new Cat("Cirkin", "Boncuk");


        //cat = new Cat("Guzel","Mavi");
        cat.name = "Boncuk2";

        // final objelerin icerigi degistirilebilir... Ama yeniden bir obje atanamaz...
        System.out.println("cat "+cat);
        cat.tirmala();

        Object object = new Object();



    }


    public static void calculatePower(final int age){  // final argument lar method icerisinde tekrar deger alamaz
       // age = 12;
    }
}
