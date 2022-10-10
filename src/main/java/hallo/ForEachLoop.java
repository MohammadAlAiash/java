package hallo;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orang" };

        for (int i=0; i< fruits.length;i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits )
            System.out.println(fruit);




    }
}
