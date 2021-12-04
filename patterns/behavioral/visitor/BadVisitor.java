package behavioral.visitor;

class BadVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Поломал двигатель");
    }
    @Override
    public void visit(BodyElement body) {
        System.out.println("Поломал корпус");
    }
}
