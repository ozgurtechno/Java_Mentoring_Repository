package interfaces;

public interface Floatable {

    int floatRange = 0;

    default void transformToFloat(){
        System.out.println("Surucu araci yuzme konumuna aldi");
    }

}
