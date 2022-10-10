package hallo;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 20){
            System.out.println("Count: " + count);
            count++;
        }
        int number = 33;
        do {
            System.out.println("Number: " + number);
            number++;
        }
        while (number <= 20);


    }
}
