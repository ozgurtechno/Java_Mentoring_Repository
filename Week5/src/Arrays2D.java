import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Arrays2D {

    public static void main(String[] args) {

        // 2 boyutlu Array
        double[][] doubleValues = {{1.5, 2.6, 3.7},
                                   {7.5, 6.4, 5.3},
                                    {9.8,  8.7, 7.6},
                                    {3.6, 5.7, 7.8}};

        String[][] stringValues;
        stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};

        int[][] numberList = new int[3][4];     // { 10, 20, 30, 0 }
        numberList[0][0] = 10;                  // { 40, 50, 60, 0 }
        numberList[0][1] = 20;                  // { 0,  0,  0,  0 }
        numberList[0][2] = 30;
        numberList[1][0] = 40;
        numberList[1][1] = 50;
        numberList[1][2] = 60;
        System.out.println(Arrays.deepToString(numberList));

        int[][] numberList2 = { { 10,20,30 },
                                { 40,50,60 }
                              };

        // 2D arrayi nasil Arraylist e ceviririz?

        System.out.println("numberList2[0] = " + Arrays.toString(numberList2[1]));

        // 2D Array elemanlarina tek tek ulasma...
        for(int i = 0; i < numberList2.length; i++){

            System.out.println("The i index is: " + i);

            for(int inner = 0; inner < numberList2[i].length; inner++){

                System.out.println("\tThe inner index is: " + inner);
                System.out.println("\tArray Element is: "+numberList[i][inner]);

            }
        }

    }
}
