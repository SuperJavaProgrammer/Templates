package structural.flyweight;

class Point implements Shape{
    @Override
    public void draw(int x, int y) {
        System.out.println("Paint a point with " + x + " " + y);
    }
}
