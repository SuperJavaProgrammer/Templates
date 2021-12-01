package structural.bridge;

class Hatchback extends Car {
    Hatchback(Model m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("Hatchback");
        model.setModel();
    }
}
