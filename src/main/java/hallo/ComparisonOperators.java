package hallo;

public class ComparisonOperators {
    public static void main(String[] args) {

    int x = 1;
    int y = 1;
        System.out.println(x==y);

    int temperature = 22 ;
    boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

    boolean hasHighIncome = true;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligible = (hasHighIncome || hasGoodCredit) && ! hasCriminalRecord;
        System.out.println(isEligible);

    int temp = 32;
    if (temp > 30){
        System.out.println("It's a hot day");
        System.out.println("Drink water");
    }
    else if (temp > 20 )
        System.out.println("Beautiful day");
    else
        System.out.println("Cold day");

    int income = 120_000;
    boolean hasHighIncome1;
    if (income > 100_000)
        hasHighIncome1 =true;
    else
        hasHighIncome1 = false;
        System.out.println(hasHighIncome1);

    boolean hasHighIncome2 = false;
    if (income > 100_000)
        hasHighIncome2 =true;
        System.out.println(hasHighIncome2);

    boolean hasHighIncome3 = (income > 100_000);
        System.out.println(hasHighIncome3);

    String className;
    if ( income > 100_000)
        className = "First";
    else
        className = "Economy";
        System.out.println("Class Name: "+className);

    String className1 ="Economy";
    if (income > 100_000)
        className1 ="First";

    String className2 = income > 100_000 ? "First": "Economy";
        System.out.println(className2);

    String role = "admin";
    if (role == "admin")
        System.out.println("you are admin");
    else if (role == "moderator")
        System.out.println("you are moderator");
    else
        System.out.println("you are a guest");

    switch (role){
        case "admin":
            System.out.println("you are admin");
            break;
        case "moderator":
            System.out.println("you are moderator");
            break;
        default:
            System.out.println("you are a guest");


    }










    }
}
