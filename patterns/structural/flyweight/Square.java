package structural.flyweight;

class Square implements Shape{
    @Override
    public void draw(int x, int y) {
        int a = 10;
        System.out.println("Paint a Square with " + x + " " + y);
    }
}
