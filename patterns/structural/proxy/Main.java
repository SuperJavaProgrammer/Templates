package structural.proxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Image ri = new RealImage("D:/mypic.jpeg");
        ri.display();
        Image pi = new ProxyImage("D:/mypic.jpeg");
        pi.display(); //ленивая инициализация
    }
}
