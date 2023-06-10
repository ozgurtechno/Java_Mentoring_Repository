package Tasks;

public class Task_3 {

    public static void main(String[] args) {

        // Please write a programme which prints Multiplication table till 7 X 7 = 49
        outer:
        for(int i = 1; i <= 10; i++) {

            // Icteki for loop.
            inner:
            for(int j = 1; j <= 10; j++){
                if (i * j == 49) break outer;
                System.out.print(i+ " x " +j+" = "+ (i*j));
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
