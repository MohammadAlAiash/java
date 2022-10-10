package hallo;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println(numbers.length);
        numbers [0]= 1;
        numbers [1]= 2;
        numbers [2]= 3;
        System.out.println(java.util.Arrays.toString(numbers));


        /*
        Array
         */
        int[] number = {3,4,5,4,23,232,12,25,56};
        int lastNumber = number[number.length-1];
        int five = number[2];
        System.out.println(java.util.Arrays.toString(number));
        System.out.println(number.length);
        System.out.println(lastNumber);
        System.out.println(five);

        //Loops
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
        //Loops
        Arrays.stream(number).forEach(System.out::println);







        Array numbers1 = new Array(3);
        numbers1.insert(10);
        numbers1.insert(20);
        numbers1.insert(30);
        numbers1.insert(40);
        numbers1.removeAt(1);
        System.out.println(numbers1.indexOf(30));
        numbers1.print();


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.remove(0);
        list.toArray();
        System.out.println(list);


        //Break und Continue
        System.out.println("Break und Continue");
        String[] name = {"ali", "mari", "ahmad"};
        for (String Name : name) {
            if (Name.endsWith("i")) {
                continue;
            }
            System.out.println(Name);
        }









    }
}
