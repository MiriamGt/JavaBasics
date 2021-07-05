package demo;

public class Persona implements IPrecedable<Persona> {

    private int dni;
    private String name;

    public Persona() {
    }

    public Persona(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int precedeA(Persona o) {
        return this.dni - o.getDni();
    }
}
