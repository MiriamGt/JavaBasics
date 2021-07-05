public class Guess {

    private String name;

    public Guess(String name) {
        this.name = name;
    }

    public void scream() {
        System.out.println("Viva la Chiqui!!");
    }

    @Override
    public String toString() {
        return "Guess{" +
                "name='" + name + '\'' +
                '}';
    }
}
