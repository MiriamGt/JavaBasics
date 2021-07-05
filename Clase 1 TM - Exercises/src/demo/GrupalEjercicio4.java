package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class GrupalEjercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number");
        int number = scanner.nextInt();
        listOfPrimeNumbers(number);
    }

    public static void listOfPrimeNumbers(int number){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int i = 1;
        while(primeNumbers.size() < number) {
            if(i%2 != 0) {
                primeNumbers.add(i);
            }
            i++;
        }
        System.out.println("Prime Numbers are: " + primeNumbers);
    }

}
