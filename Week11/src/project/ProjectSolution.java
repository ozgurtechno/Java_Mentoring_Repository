package project;

import java.util.*;

public class ProjectSolution {
    public static void main(String[] args) {

       /*
       User enters 10 integers.
       Show all numbers in sorted order(descending order).
       Also show numbers without duplicate values.
       */
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//        for(int i=1; i<=10; i++){
//            System.out.print("enter a number #" + i + ": ");
//            Integer num = in.nextInt();
//            numbers.add(num);
//        }
//
//        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
//        set.addAll(numbers);
//
//        for(Integer number : set){
//            System.out.print(number + " ");
//        }



        /*
        User enters numbers one by one until he enters 0.
        Find if there are at least two equal numbers before zero.
        */
//        Scanner in2 = new Scanner(System.in);
//
//        ArrayList<Integer> numberss = new ArrayList<>();
//        while(true){
//            System.out.print("enter a number: ");
//            int num = in2.nextInt();
//            if(num == 0)
//                break;
//            numberss.add(num);
//        }
//
//        HashSet<Integer> set2 = new HashSet<>();
//        set2.addAll(numberss);
//
//        if(set2.size() != numberss.size())
//            System.out.println("Contains duplicate values");
//        else
//            System.out.println("Does not contain duplicate values");


        /*
        User enters 10 words(words can be duplicated when entered).
        After show all words with a number of how many times each word was entered.
        The order doesn’t matter(no need to sort words when you show the result).
        */
//        Map<String, Integer> wordsCountMap = new HashMap<>();
//        Scanner in3 = new Scanner(System.in);
//        for(int i=1; i<=10; i++){
//            System.out.print("enter a word: ");
//            String word = in3.next();
//            if(!wordsCountMap.containsKey(word))
//                wordsCountMap.put(word, 1);
//            else
//                wordsCountMap.put(word, wordsCountMap.get(word)+1);
//        }
//        for (String word : wordsCountMap.keySet()) {
//            System.out.println(word + " was entered " + wordsCountMap.get(word) + " many times");
//        }


        /*
        User enters 10 pairs of department name – worker name.
        Department and worker names can be duplicated when entered.
        After show all workers of each department.
        Here when you show the result the department names should be sorted in alphabetical order.
        */

        Map<String, HashSet<String>> depWorkersMap = new TreeMap<>();
        Scanner in4 = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            System.out.print("enter a department and worker name: ");
            String dep = in4.next();
            String worker = in4.next();
            if(!depWorkersMap.containsKey(dep)){
                depWorkersMap.put(dep, new HashSet<>());
                HashSet<String> workers = depWorkersMap.get(dep);
                workers.add(worker);
            }
            else{
                HashSet<String> workers = depWorkersMap.get(dep);
                workers.add(worker);
            }
        }

        for (String dep : depWorkersMap.keySet()) {
            System.out.println(dep + " has workers: " + depWorkersMap.get(dep));
        }


    }
}
