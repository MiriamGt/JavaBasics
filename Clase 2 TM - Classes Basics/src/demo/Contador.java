package demo;

public class Contador {

    private int counter;
    private Contador c;

    //Constructor 1
    public Contador (int c) {
        this.counter = c;
    }

    //Constructor 2
    public Contador (Contador c) {
        this.c = c;
    }

    //Getters and Setters
    public int getCounter() {
        return counter;
    }

    public void setCounter(int c) {
        counter = c;
    }

    public int increase(){
        return counter++;
    }

    public int decrease(){
        return counter--;
    }
}
