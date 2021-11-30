package structural.composite;

//позволяет сгруппировать объекты в древовидную структуру, а затем работать с ними так, как будто это единый объект
public class Main {
    public static void main(String[] args) {
        Composite c = new Composite();
            c.addComponent(new Triangle());
            c.addComponent(new Square());

        Composite c1 = new Composite();
            c1.addComponent(new Triangle());
            c1.addComponent(new Square());
            c1.addComponent(c);
        c1.draw();
    }
}
