import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrera {

    private Integer distancia;
    private Float premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;

    public List<Vehiculo> getParticipantes() {
        return participantes;
    }

    private List<Vehiculo> participantes = new ArrayList<>();

    public SocorristaAuto socorristaAuto = new SocorristaAuto();
    public SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Carrera(Integer distancia, Float premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public void darDeAlta(Vehiculo vehiculo) {
        if(!Objects.isNull(vehiculo)) {
            this.participantes.add(vehiculo);
        }
    }

    public void removeVehicule(Vehiculo vehiculo) {
        if(!Objects.isNull(vehiculo)) {
            this.participantes.remove(vehiculo);
        }
    }

    public void removeVehiculeByPatente(String patente) {
        removeVehicule(participantes.stream()
                .filter(vehiculo -> patente.equals(vehiculo.getPatente()))
            .findAny()
                .orElse(null));
    }

    public String getWinner(List<Vehiculo> participantes) {
        Double score = 0.0;
        Vehiculo winner = new Vehiculo();
        for(Vehiculo participante : participantes) {
            if (getScore(participante).compareTo(score) > 0) {
                winner = participante;
                score = getScore(participante);
            }
        }
        return winner.getPatente();
    }

    private Double getScore(Vehiculo vehiculo) {
        Double numerador = vehiculo.getVelocidad() * (vehiculo.getAceleracion() *.5);
        Double denominador = vehiculo.getAnguloDeGiro()*(vehiculo.getPeso() - vehiculo.getRueda() * 100);
        Double score = numerador / denominador;
        return score;
    }

    public void socorrerAuto(Auto auto) {
        socorristaAuto.socorrer(auto);
    }

    public void socorrerMoto(Moto moto) {
        socorristaMoto.socorrer(moto);
    }

}

