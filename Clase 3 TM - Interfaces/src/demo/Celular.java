package demo;

public class Celular implements IPrecedable<Celular> {

    private String number;
    private String name;

    public Celular(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.number.compareTo(celular.getNumber());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
