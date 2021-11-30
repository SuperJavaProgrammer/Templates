package structural.decorator;

class RightDecorator extends Decorator {
    RightDecorator(PrintInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}
