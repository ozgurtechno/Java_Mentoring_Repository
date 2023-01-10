package interfaces;

public interface Floatable {

    int floatRange = 200;

    default void transformToFloat(){
        System.out.println("Surucu araci yuzme konumuna aldi");
    }

}
