package structural.decorator;

class Printer implements PrintInterface {
    private String value;

    Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
