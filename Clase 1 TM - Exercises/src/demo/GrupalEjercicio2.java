package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class GrupalEjercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números");
        int number = scanner.nextInt();
        System.out.println("Ingresa el múltiplo");
        int multiple = scanner.nextInt();
        multipleNumbers(number, multiple);
    }

    public static void multipleNumbers(int number, int multiple){
        ArrayList<Integer> listNumbers = new ArrayList<>();
        int i = 1;
        while (listNumbers.size() < number) {
            if(i%multiple == 0) {
                listNumbers.add(i);
            }
            i++;
        }
        System.out.println("List of multiple numbers of " + multiple + " is " + listNumbers);
    }
}
