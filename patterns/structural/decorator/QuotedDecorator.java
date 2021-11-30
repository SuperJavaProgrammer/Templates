package structural.decorator;

class QuotedDecorator extends Decorator {
    QuotedDecorator(PrintInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("'");
        super.print();
        System.out.print("'");
    }
}
