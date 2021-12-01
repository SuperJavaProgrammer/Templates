package structural.bridge;

abstract class Car {
    Model model;

    Car(Model m) {
        model = m;
    }

    abstract void showDetails();
}
