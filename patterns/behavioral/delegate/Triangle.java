package behavioral.delegate;

class Triangle implements Graph {
    @Override
    public void draw() {
        System.out.println("Рисуем Треугольник");
    }
}
