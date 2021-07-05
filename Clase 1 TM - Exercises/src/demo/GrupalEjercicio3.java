package demo;

import java.util.Scanner;

public class GrupalEjercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number");
        int number = scanner.nextInt();
        isPrimeNumber(number);
    }

    public static void isPrimeNumber(int number){
        if(number%2 != 0) {
            System.out.println("Number " + number + " is Prime");
        } else {
            System.out.println("Number " + number + " is not Prime");
        }
    }
}
