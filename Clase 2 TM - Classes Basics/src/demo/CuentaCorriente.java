package demo;

public class CuentaCorriente {

    private int value;
    private CuentaCorriente var;

    //Constructor 1
    public CuentaCorriente (int number) {
        this.value = number;
    }

    //Constructor 2
    public CuentaCorriente (CuentaCorriente variable) {
        this.var = variable;
    }

    //Instance Methods
    public double getBalance() {
        return value;
    }

    public void setBalance(int s){
        value = s;
    }

    public void ingreso(){

    }

    public void egreso(){

    }

    public void reintegro(){

    }

    public void transferencia(){

    }

}
