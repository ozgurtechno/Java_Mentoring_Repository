package final_Keyword;

public class Animal {                  // Final Class lar extend edilemez...

    static final int MAX_NUMBER = 100; // Final field lara tekrar yeni deger assing edilemez

    public Animal() {
    }

    public void tirmala(){             // Final olursa owerride edilemez...
        System.out.println("Tirmala");
        // MAX_NUMBER = 12;
    }
}
