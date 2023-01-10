package final_Keyword;

public /* final */ class Animal {      // Final Class lar extend edilemez...

    static final int MAX_NUMBER = 100; // Final field lara tekrar yeni deger assing edilemez...

    public Animal() {
    }

    public /* final */ void tirmala(){             // Method Final olursa override edilemez...
        System.out.println("Tirmala");
        // MAX_NUMBER = 12;
    }
}
