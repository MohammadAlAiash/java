import hallo.Auto;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class HalloWorld<a> {
    HalloWorld<Integer> halloWorld = new HalloWorld<Integer>();
    public static void main(String[] args) {
        System.out.println("I love pizza");
        System.out.println("It`s so yummy");
        System.out.println("It`s so yummy");
    Auto auto = new Auto("keyboard");
        System.out.println(auto.getName());
        int myAge = 20;
        int herAge=myAge;
        System.out.println(herAge);
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x =2;
        System.out.println(point1);
        String messag = "  hallo"+" world";
        System.out.println(messag);
        System.out.println(messag.toUpperCase(Locale.ROOT));
        System.out.println(messag.endsWith("d"));
        System.out.println(messag.startsWith("d"));
        System.out.println(messag.length());
        System.out.println(messag.replace("w","q"));
        System.out.println(messag.trim());
        String messag1="hallo \"ahmad\"";
        System.out.println(messag1);



         int[] number1={1,2,5,4,3};
          Arrays.sort(number1);
        System.out.println(number1.length);
        System.out.println(Arrays.toString(number1));
         int[][] number2 = new int[2][5];
         number2 [0][0]=1;
         number2[1][1]=2;
        System.out.println(Arrays.deepToString(number2));
        int[][] number3={{1,2,3},{4,3,5}} ;
        System.out.println(Arrays.deepToString(number3));
        double result = (double) 10/ (double) 3;
        System.out.println(result);
        int a=1;
        a+=2;
        int b=++a;
        System.out.println(a);
        System.out.println(b);
        int x = (10 + 3)  * 2;
        System.out.println(x);
        //Implicit casting
        //byte > short > int > long
        short q =1;
        int w = q+2;
        System.out.println(w);
        double e = 1.1;
        int r = (int) e + 2;
        System.out.println(r);
        String t ="1";
        int z = Integer.parseInt(t) +2;
        System.out.println(z);
        String u = "1.1";
        double i = Double.parseDouble(u)+2;
        System.out.println(i);
        int s = Math.round(1.1f);
        System.out.println(s);
        int d =(int) Math.floor(1.1f);
        System.out.println(d);
        int f =(int) Math.ceil(1.1f);
        System.out.println(f);
        int g = Math.max(1,2);
        System.out.println(g);
        double h = Math.random() * 100;
        System.out.println(h);
        double j= Math.round(Math.random()*100);
        System.out.println(j);
        int k = (int) Math.round(Math.random()*100);
        System.out.println(k);
        int l = (int) (Math.random()*100);
        System.out.println(l);

        NumberFormat currency =NumberFormat.getCurrencyInstance();
        String ö = currency.format(145112134.212);
        System.out.println(ö);
        NumberFormat percent =NumberFormat.getPercentInstance();
        String ä = percent.format(0.1);
        System.out.println(ä);
        String c= NumberFormat.getPercentInstance().format(0.1);
        System.out.println(c);








   }
}



