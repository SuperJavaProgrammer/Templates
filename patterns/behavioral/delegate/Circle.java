package behavioral.delegate;

class Circle implements Graph {
    @Override
    public void draw() {
        System.out.println("Рисуем Круг");
    }
}
