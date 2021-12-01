package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private Map<String, Shape> shapes = new HashMap<>();

    Shape getShape(String name) {
        Shape shape = shapes.get(name);
        if (shape == null) {
            switch (name) {
                case "круг":
                    shape = new Circle();
                    break;
                case "квадрат":
                    shape = new Square();
                    break;
                case "точка":
                    shape = new Point();
            }
            shapes.put(name, shape);
        }
        return shape;
    }
}
