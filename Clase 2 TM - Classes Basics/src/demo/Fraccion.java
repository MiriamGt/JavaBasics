package demo;

import java.util.Arrays;

public class Fraccion {

    public static void main(String[] args) {
        String a = "3/5";
        String b = "2";

        //Numbers
        int c = 1;
        int d = 1;
        int e = 1;
        int f = 1;

        String[] num1 = a.split("/");
        String[] num2 = b.split("/");

        if (num1.length <= 1 && num2.length <= 1) {
            c = Integer.valueOf(num1[0]);
            e = Integer.valueOf(num2[0]);
        } else if(num1.length <= 1 && num2.length > 1) {
            c = Integer.valueOf(num1[0]);
            e = Integer.valueOf(num2[0]);
            f = Integer.valueOf(num2[2]);
        } else if (num1.length > 1 && num2.length <= 1) {
            c = Integer.valueOf(num1[0]);
            d = Integer.valueOf(num1[1]);
            e = Integer.valueOf(num2[0]);
        } else {
            c = Integer.valueOf(num1[0]);
            d = Integer.valueOf(num1[1]);
            e = Integer.valueOf(num2[0]);
            f = Integer.valueOf(num2[1]);
        }

        System.out.println(add(c,d,e,f));
        System.out.println(subtract(c,d,e,f));
        System.out.println(multiply(c,d,e,f));
        System.out.println(division(c,d,e,f));

    }

    //Suma
    public static String add(int c, int d, int e, int f) {
        return (c*f + d*e) + " / " + (d*f);
    }

    public static String subtract(int c, int d, int e, int f){
        return (c*f - d*e) + " / " + (d*f);
    }

    public static String multiply(int c, int d, int e, int f) {
        return c*e + " / " + d*f;
    }

    public static String division(int c, int d, int e, int f) {
        return c*f + " / " + d*e;
    }

}
