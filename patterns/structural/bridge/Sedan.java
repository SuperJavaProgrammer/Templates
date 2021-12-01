package structural.bridge;

class Sedan extends Car {
    Sedan(Model m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        model.setModel();
    }
}
