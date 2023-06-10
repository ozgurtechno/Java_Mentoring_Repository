public class Project_3 {
    public static void main(String[] args) {

        // #1.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter size of array: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        System.out.print("enter " + n + " positive values: ");
//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        int max = 0, maxIndex = 0;
//        for(int i=0; i<arr.length; i++){
//            // you should compare with >= because if you find second max number you should also save its index to maxIndex
//            if(arr[i] >= max){
//                max = arr[i];
//                maxIndex = i;
//            }
//        }
//
//        System.out.println("index of last max number is: " + maxIndex);

        // #2.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//        System.out.print("enter size of array: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(1, 10);
//            System.out.print(arr[i] + " ");
//        }
//
//        int countLeft = 0, countRight = 0;
//
//        for(int i=0; i<arr.length/2; i++){
//            if(arr[i] % 2 == 1)
//                countLeft++;
//        }
//
//        int middleIndex = arr.length/2;
//
//        if(arr.length % 2 == 1)
//            middleIndex++;
//
//        for(int i=middleIndex; i<arr.length; i++){
//            if(arr[i] % 2 == 1)
//                countRight++;
//        }
//
//        if(countLeft > countRight)
//            System.out.println("\nLeft");
//        else
//            if(countRight > countLeft)
//                System.out.println("\nRight");
//            else
//                System.out.println("\nEqual");

        // #3.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//        System.out.print("enter size of array: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(1, 10);
//            System.out.print(arr[i] + " ");
//        }
//
//        int count = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if((arr[i] % 2 == 1 && i % 2 == 1) || (arr[i] % 2 == 0 && i % 2 == 0))
//                count++;
//        }
//
//        System.out.println("\nThere are " + count + " cases.");

        // #4.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//        System.out.print("enter size of array: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(1, 101);
//            System.out.print(arr[i] + " ");
//        }
//
//        int max = arr[0];
//        int min = arr[0];
//        int maxIndex = 0, minIndex = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i]; //saving max number to max variable
//                maxIndex = i; //saving index of ma number
//            }
//            if(arr[i] < min){
//                min = arr[i]; //saving min number to min variable
//                minIndex = i; //saving index of min number
//            }
//        }
//
//        if(minIndex > maxIndex)
//            System.out.println("\nThere are " + (minIndex - maxIndex - 1) + " numbers between min and max");
//        else
//            System.out.println("\nThere are " + (maxIndex - minIndex - 1) + " numbers between min and max");

        // #5.
//        for(int i=1; i<=10; i++){
//            for(int j=1; j<=10; j++){
//                System.out.print((i*j) + " ");
//            }
//            System.out.println();
//        }

        // #6.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i+j > n)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();
//        }

        // #7.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        int stars = n*2-1; //initially there are N*2-1 stars in first line (just formula)
//        int spaces = 0;
//
//        for(int i=1; i<=n; i++){
//
//            for(int j=1; j<=spaces; j++)
//                System.out.print("   ");
//
//            for(int k=1; k<=stars; k++)
//                System.out.print(" * ");
//
//            stars = stars - 2; // in each line the number of stars is 2 less then in previous line
//            spaces++; // in each next line, the number of spaces increases by 1
//
//            System.out.println();
//        }

        // #8.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter even number N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if((i <= n/2 && j <= n/2) || (i > n/2 && j > n/2))
//                    System.out.print(" * ");
//                else
//                    System.out.print(" - ");
//            }
//            System.out.println();
//        }
    }
}
