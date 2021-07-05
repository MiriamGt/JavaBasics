package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class GrupalEjercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int number = scanner.nextInt();
        evenNumbers(number);
    }

    public static void evenNumbers(int number) {
        ArrayList<Integer> evenListNumbers = new ArrayList<>();
        int i = 1;
        while (evenListNumbers.size() < number) {
            if(i%2 == 0) {
                evenListNumbers.add(i);
            }
            i++;
        }
        System.out.println("Addon numbers are  = " + evenListNumbers);
    }
}
