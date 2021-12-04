package behavioral.visitor;

class GoodVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Починил двигатель");
    }
    @Override
    public void visit(BodyElement body) {
        System.out.println("Починил корпус");
    }
}
