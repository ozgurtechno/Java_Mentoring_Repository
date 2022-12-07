import java.util.Arrays;

public class Arrays2D {

    public static void main(String[] args) {

        // 2 boyutlu Array

        int[][] numberList = new int[3][4];     // { 10, 20, 30, 0 }
        numberList[0][0] = 10;                  // { 40, 50, 60, 0 }
        numberList[0][1] = 20;                  // { 0,  0,  0,  0 }
        numberList[0][2] = 30;                  //
        numberList[1][0] = 40;
        numberList[1][1] = 50;
        numberList[1][2] = 60;
        System.out.println(Arrays.deepToString(numberList));

        int[][] numberList2 = { { 10,20,30 },
                { 40,50,60 }
        };

        System.out.println("numberList2[0] = " + Arrays.toString(numberList2[0]));
    }
}
