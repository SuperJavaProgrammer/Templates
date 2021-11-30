package structural.decorator;

//позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные обертки
public class Main {
    public static void main(String[] args) {
        PrintInterface printer = new Printer("Hello World");
        printer.print();

        System.out.println();
        printer = new QuotedDecorator(new LeftDecorator(new RightDecorator(new Printer("Hello World"))));
        printer.print();
    }
}
