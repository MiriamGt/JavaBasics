package demo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Persona[] personita = {new Persona(5, "Pablo")
                , new Persona(10, "Juan")
                , new Persona(7, "Alberto")
                , new Persona(2, "Raul")};

        Celular[] numbers = {new Celular("533322", "Pablo")
                , new Celular("10655252", "Juan")
                , new Celular("755242", "Alberto")
                , new Celular("7965958", "Raul")};

        SortUtils.sort(personita);
        System.out.println(Arrays.toString(personita));

        SortUtils.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
