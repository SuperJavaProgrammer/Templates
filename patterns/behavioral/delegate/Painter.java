package behavioral.delegate;

class Painter {
    private Graph graph;
    void serGraph(Graph graph) {
        this.graph = graph;
    }
    void draw() {
        graph.draw();
    }
}
