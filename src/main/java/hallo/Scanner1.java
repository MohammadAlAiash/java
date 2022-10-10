package hallo;

import java.time.LocalDate;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is you name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName.trim().toUpperCase());
        System.out.println("How old are you");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("you were born in " + year);
        if (age < 18){
            System.out.println("yuo are not an adult :(");
        }else {
            System.out.println("yuo are  an adult :)");

        }
    }
}
