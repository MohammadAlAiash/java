package hallo;

import java.math.MathContext;
import java.util.Locale;

public class Lerne {
    public static void main(String[] args) {
        Person alex = new Person("alex");
        Person mariam = alex;
        System.out.println(alex.name +" "+ mariam.name);

        mariam.name ="Mariam";
        System.out.println(alex.name +" "+ mariam.name);
        double m = Math.abs(-2);


        int khaledAge = 20;
        int matiamAge = 18;
        System.out.println( khaledAge < matiamAge);


        int age = 17;
        String message = age >= 18 ? " I am an adult" : "I am not an adult";
        System.out.println(message);
        if (age >= 18){
            System.out.println(" I am an adult");
        }

            else {
                System.out.println("I am not an adult");
            }


            String gender = " female";
            if (gender.equals("FEMALE")){
            }
            else if (gender.equals("MALE")){
            }
            else if (gender.equals("PREFER_NOT_SAY")){
            }
            else {
            }

            switch (gender.trim().toUpperCase(Locale.ROOT)){
                case "FEMALE":
                    System.out.println("I am a female");
                    break;
                case "MALE" :
                    System.out.println("I am a male");
                    break;
                case "PREFER_NOT_SAY":
                    System.out.println("Prefer not say");
                    break;
                default:
                    System.out.println("Unknown gender");
            }







    }


    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }


    }


}
