package demo;

import java.util.Scanner;

public class IndividualEjercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta el radio");
        String ratio = scanner.nextLine();
        double area = getArea(ratio);
        System.out.println("El área es: " + area);
    }

    public static double getArea(String ratio) {
        double r = Double.parseDouble(ratio);
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
}
