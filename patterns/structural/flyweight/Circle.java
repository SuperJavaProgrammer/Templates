package structural.flyweight;

class Circle implements Shape{
    @Override
    public void draw(int x, int y) {
        int r = 5;
        System.out.println("Paint a Circle with " + x + " " + y);
    }
}
