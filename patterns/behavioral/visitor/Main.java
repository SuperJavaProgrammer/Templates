package behavioral.visitor;

//позволяет создавать новые операции, не меняя классы объектов, над которыми эти операции могут выполняться
public class Main {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();

        Visitor bad = new BadVisitor();
        body.accept(bad);
        engine.accept(bad);

        Visitor good = new GoodVisitor();
        body.accept(good);
        engine.accept(good);
    }
}
