package hallo;

public class BigO {
    public static void log (int[] numbers, String[] names) {
       // O(2)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);


        // O(n)
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        // O(n)
        System.out.println();// O(1)
        for (int number : numbers)// O(n)
            System.out.println(number);
        System.out.println();// O(1)



       // O(2n) = O(n)
        for (int number : numbers)// O(n)
            System.out.println(number);
        for (int number : numbers)// O(n)
            System.out.println(number);


        // 0(n)
        for (int number : numbers)// O(n)
            System.out.println(number);

        for (String name : names)
            System.out.println(name);// O(m)


        // O(n+n^3)
        for (int number : numbers)// O(n)
            System.out.println(number);
        for (int first: numbers)// O(n)
        for (int second : numbers)// O(n)
        for (int third: numbers)// O(n)
            System.out.println(first + "" + second + third);




        // O(n) space
        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++)
            System.out.println("Hi" + names[i]);


    }
}
