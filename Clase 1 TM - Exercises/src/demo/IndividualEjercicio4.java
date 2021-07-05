package demo;

import java.util.Scanner;

public class IndividualEjercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is divisible by 2" );
        } else {
            System.out.println("Number " + number + " is not divisible by 2" );
        }
    }
}
