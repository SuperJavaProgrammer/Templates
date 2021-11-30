package structural.decorator;

abstract class Decorator implements PrintInterface { //если мало декораторов, то не нужен, а так он содержит общую часть
    private PrintInterface component;

    Decorator(PrintInterface component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}
