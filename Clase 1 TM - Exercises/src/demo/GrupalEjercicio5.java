package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class GrupalEjercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números");
        int n = scanner.nextInt();
        System.out.println("Ingresa la cantidad mínima de dígitos");
        int m = scanner.nextInt();
        System.out.println("Ingresa el dígito que se debe repetir");
        int d = scanner.nextInt();
        listOfNumbers(n, m, d);
    }

    public static void listOfNumbers (int n, int m, int d) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while (list.size() < n) {
            String s = String.valueOf(i);
            char digit = (char)('0' + d);
            int counter = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == digit) {
                    counter++;
                }
            }
            if (counter == m) {
                list.add(i);
            }
            i++;
        }
        System.out.println("List of numbers = " + list);
    }
}
