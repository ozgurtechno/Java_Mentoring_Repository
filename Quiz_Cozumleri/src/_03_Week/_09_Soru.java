package _03_Week;

public class _09_Soru {
    /*

        public class _01_deneme {

            public static void main(String[] args) {

                String name = "Study";

                if (name.length() > 10 && name.contains("Study")) {

                    System.out.println("it looks good");

                }

                int num1 = 20;

                if (num1 > 10 || num1 < 15) {

                    System.out.println("my number is: " + num1);

                }

            }
        }

        Yukardaki kod parçasının çıktısı ne olur?

        Cevap = "my number is: 20".

     */

    public static void main(String[] args) {


        String name = "Study";

        if (name.length() > 10 && name.contains("Study")) {

            System.out.println("it looks good");

        }

        // 1. koşulda name değişkeninin uzunluğu 10 dan yukariya oladığı için ve arada "ve" bağlacı olduğu
        // için 2. koşul true olsa dahi çalışma bloğu aksiyon vermeyecektir.

        int num1 = 20;

        if (num1 > 10 || num1 < 15) {

            System.out.println("my number is: " + num1);
        }

        // 1. koşul true olduğu için, ve "veya" bağlacı ile bağlandığı için, 2. koşul false olsa bile
        // çalışma bloğu çalışacaktir.


    }
}
