import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Prenda prenda1 = new Prenda("prada", "56362");
        Prenda prenda2 = new Prenda("zara", "748272");

        Prenda prenda3 = new Prenda("hdfgd", "8272");
        Prenda prenda4 = new Prenda("jdjud", "5351");

        List<Prenda> clothesList = new ArrayList<>();
        clothesList.add(prenda1);
        clothesList.add(prenda2);

        List<Prenda> clothesList2 = new ArrayList<>();
        clothesList.add(prenda3);
        clothesList.add(prenda4);

        GuardaRopa save = new GuardaRopa();
        System.out.println("Key value = " + save.guardarPrendas(clothesList));
        System.out.println("Key value = " + save.guardarPrendas(clothesList2));

        System.out.println("Prendas.......");
        save.mostrarPrendas();

        System.out.println("Devolver Prenda...");
        save.devolverPrendas(0);

    }
}
