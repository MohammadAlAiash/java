package hallo;

import java.time.LocalDate;

public class Classes {
    public static void main(String[] args) {
        // Classes
        lens lensOne = new lens("Sony", "35mm", true);
        lens lensTow = new lens("Sony", "70mm", true);
        lens lensThree = new lens("Kanon" ,"20-70mm", false);
        System.out.println(lensOne.focalLength);

        // Classes
         Passport ukPassport = new Passport("32341","England", LocalDate.of(2026,1,1));
        Passport dePassport = new Passport("234212","Deutschland", LocalDate.of(2030,3,3));
        System.out.println(ukPassport.country);
    }
     static class lens{
        String brand;
        String modale;
        String colour;
        double price;
        double weight;
        String focalLength;
        boolean isPrime;
        lens(String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

    static class Passport{
        String number;
        String country;
        LocalDate expiryDate;
        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
        }
    }


