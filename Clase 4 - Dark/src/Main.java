public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto(105.0, 6.0, 90, "kia");
        Auto auto2 = new Auto(208.0, 9.0, 40, "mazda");
        Auto auto3 = new Auto(10.0, 1.0, 20, "chevrolet");
        Moto moto = new Moto(10.0, 4.0, 45, "toyota");

        Carrera carrera = new Carrera(20, 500f, "java", 5);
        carrera.darDeAlta(auto);
        carrera.darDeAlta(auto2);
        carrera.darDeAlta(auto3);
        carrera.darDeAlta(moto);


        System.out.println(carrera.getParticipantes());
        carrera.removeVehicule(auto2);
        System.out.println(carrera.getParticipantes());
        carrera.socorrerAuto(auto);
        carrera.socorrerMoto(moto);

    }

}
