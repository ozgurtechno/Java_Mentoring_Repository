package final_Keyword;

public class final_Demo {

    public static void main(String[] args) {

        String example = "String bir Final Class dir... Immutable";
        example = "yeni kelime";
        System.out.println(example); // Final Class

        // Primitive data
        final int MAX_NUMBER = 12;   // MAX_NUMBER = 13;
        // Reference Type
        final Cat cat = new Cat("Cirkin");
        // cat = new Cat("Guzel");
        cat.name = "Boncuk"; // final objelerin icerigi degistirilebilir... Ama yeniden bir obje atanamaz...
        System.out.println(cat);



    }


    public static void calculatePower(final int age){  // final argument lar method icerisinde tekrar deger alamaz
       // age = 12;
    }
}
