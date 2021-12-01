package structural.bridge;

//разделяет один или несколько классов на две отдельные иерархии - абстракцию и реализацию, позволяя изменять их независимо друг от друга
public class Main {
    public static void main(String[] args) {
        Car c = new Sedan(new Shkoda());
        c.showDetails();
        c = new Sedan(new Jaguar());
        c.showDetails();
        c = new Hatchback(new Kia());
        c.showDetails();
    }
}
