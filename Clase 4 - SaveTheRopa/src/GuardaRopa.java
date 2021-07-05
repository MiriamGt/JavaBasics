import java.util.*;

public class GuardaRopa {

    private Map<Integer,List <Prenda>> mapa = new HashMap<>();
    private Integer counter = 0;

    public GuardaRopa() {
    }

    public GuardaRopa(Map<Integer, List<Prenda>> mapa) {
        this.mapa = mapa;
    }

    public Map<Integer, List<Prenda>> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Integer, List<Prenda>> mapa) {
        this.mapa = mapa;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        System.out.println("Saving Clothes.......");
        counter++;
        mapa.put(counter, listaDePrenda);
        return counter;
    }

    public void mostrarPrendas(){
        for (Map.Entry<Integer,List<Prenda>> entry : mapa.entrySet()) {
            List<Prenda> list = entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        for (Map.Entry<Integer,List<Prenda>> entry : mapa.entrySet()) {
            List<Prenda> list = entry.getValue();
            if(entry.getKey() == numero) {
                System.out.println(entry);
                return list;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "GuardaRopa{" +
                "mapa=" + mapa +
                ", counter=" + counter +
                '}';
    }
}
