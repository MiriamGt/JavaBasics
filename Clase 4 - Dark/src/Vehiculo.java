public class Vehiculo {

    private Double velocidad;
    private Double aceleracion;
    private Integer anguloDeGiro;
    private String patente;
    private Double peso;
    private Integer rueda;

    public Vehiculo() {
    }

    public Vehiculo(Double velocidad, Double aceleracion, Integer anguloDeGiro, String patente, Double peso, Integer rueda) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.rueda = rueda;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Integer getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Integer anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getRueda() {
        return rueda;
    }

    public void setRueda(Integer rueda) {
        this.rueda = rueda;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidad=" + velocidad +
                ", aceleración=" + aceleracion +
                ", anguloDeGiro=" + anguloDeGiro +
                ", patente='" + patente + '\'' +
                ", peso=" + peso +
                ", rueda=" + rueda +
                '}';
    }
}
