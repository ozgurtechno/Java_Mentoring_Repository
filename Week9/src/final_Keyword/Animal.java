package final_Keyword;

public /* final */ class Animal {      // Final Class lar extend edilemez...

    static final int MAX_NUMBER = 100; // Final field lara tekrar yeni deger assing edilemez...
    static final double PI = 3.14; // Final field lara tekrar yeni deger assing edilemez...


    public Animal() {
    }

    final void tirmala(){             // Method Final olursa override edilemez...
        System.out.println("Animal classinda Tirmala");
         //MAX_NUMBER = 12;
        double x = Math.PI;
    }
}
