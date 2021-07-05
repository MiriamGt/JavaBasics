public class Moto extends Vehiculo {

    private static final Double PESO = 300.0;
    private static final Integer RUEDA = 2;

    public Moto(Double velocidad, Double aceleracion, Integer anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, Moto.PESO, Moto.RUEDA);
    }

}
