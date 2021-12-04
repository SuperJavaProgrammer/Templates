package behavioral.delegate;

//объект внешне выражает некоторое поведение, но в реальности передаёт ответственность за выполнение этого поведения связанному объекту
public class Main {
    public static void main(String[] args) {
        Painter p = new Painter();
        p.serGraph(new Triangle());
        p.draw();
        p.serGraph(new Square());
        p.draw();
        p.serGraph(new Circle());
        p.draw();
    }
}
