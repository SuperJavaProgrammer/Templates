package behavioral.visitor;

interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
