package SoruCozumleri;

public class Cozumler {

    public static void main(String[] args) {

        System.out.println("------------------------------ Ornek 1 --------------------------------------");

        // Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...
        int [] arr = new int [] {11, 22, 33, 99, 88, 77};

        int largestElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > largestElement)
                largestElement = arr[i];
        }
        System.out.println("Largest element of given array: " + largestElement);

        System.out.println("------------------------------ Ornek 2 --------------------------------------");

        // Ornek 2 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..
        int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        int [] frequency = new int [numbers.length];
        int counted = -1;
        for(int i = 0; i < numbers.length; i++){
            int count = 1;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    //To avoid counting the frequency of same element again
                    frequency[j] = counted;
                }
            }
            if(frequency[i] != counted)
                frequency[i] = count;
        }

        //Printing the frequency of each element
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != counted)
                System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
        }

        System.out.println("------------------------------ Ornek 3 --------------------------------------");

        // Ornek 3 : Verilen bir Array de tekrar eden elemanlari yazdirin...
        int [] numbers2 = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
        System.out.println("Duplicate elements in given array are: ");
        //Comparing each element of the array with all other elements
        for(int i = 0; i < numbers2.length; i++) {
            for(int j = i + 1; j < numbers2.length; j++) {
                if(numbers2[i] == numbers2[j]) {
                    //printing duplicate elements
                    System.out.println(numbers2[j]);
                }
            }
        }

        System.out.println("------------------------------ Ornek 4 --------------------------------------");

        // Ornek 4 : Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        String str = new String(ch);
        System.out.println(str);

        // Method 2: Using valueOf method
        String str2 = String.valueOf(ch);
        System.out.println(str2);
    }
}
