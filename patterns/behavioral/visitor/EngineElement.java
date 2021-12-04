package behavioral.visitor;

class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
