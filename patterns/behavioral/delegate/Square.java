package behavioral.delegate;

class Square implements Graph {
    @Override
    public void draw() {
        System.out.println("Рисуем Квадрат");
    }
}
