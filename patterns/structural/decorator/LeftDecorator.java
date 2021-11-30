package structural.decorator;

class LeftDecorator extends Decorator {
    LeftDecorator(PrintInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}
