package hallo;

import java.util.Scanner;

public class Auto {
    private String name;
    public Auto(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        System.out.println("hallo " + i);
        for (int g = 5; g >0; g--)
            System.out.println("hallo " +g);


        Scanner scanner= new Scanner(System.in);
        System.out.print("age:");
        byte age=scanner.nextByte();
        System.out.println("you are " + age);

        Scanner scanner1= new Scanner(System.in);
        System.out.print("age1:");
        double age1 = scanner1.nextDouble();
        System.out.println("you are " +(int) age1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name:");
        String name =scanner2.nextLine().trim();
        System.out.println("you are " + name);






    }
}
