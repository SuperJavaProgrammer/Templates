package structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//позволяет вместить большое количество объектов в отведенную оперативную память, разделяя общее состояние объектов между собой, вместо храниение одинаковых данных в каждом объекте
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();
            shapes.add(shapeFactory.getShape("квадрат"));
            shapes.add(shapeFactory.getShape("круг"));
            shapes.add(shapeFactory.getShape("круг"));
            shapes.add(shapeFactory.getShape("квадрат"));
            shapes.add(shapeFactory.getShape("точка"));

        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x, y);
        }
    }
}
