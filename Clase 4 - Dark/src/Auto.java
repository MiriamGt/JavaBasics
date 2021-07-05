public class Auto extends Vehiculo{

    private static final Double PESO = 1000.0;
    private static final Integer RUEDA = 4;


    public Auto(Double velocidad, Double aceleración, Integer anguloDeGiro, String patente) {
        super(velocidad, aceleración, anguloDeGiro, patente, Auto.PESO, Auto.RUEDA);
    }

}
