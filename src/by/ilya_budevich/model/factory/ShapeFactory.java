package by.ilya_budevich.model.factory;

import by.ilya_budevich.model.*;
import by.ilya_budevich.model.Rectangle;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ShapeFactory {
    private final Map<String, Function<double[], Shape>> shapes = new HashMap<>();
    private static ShapeFactory instance;

    public Shape getShape(String shapeName, double ...params) {
        return shapes.get(shapeName).apply(params);
    }

    public String[] getShapeNames() {
        return shapes.keySet().toArray(new String[0]);
    }

    private ShapeFactory() {
        shapes.put("Circle", (params) -> new Circle(params[0], params[1], params[2]));
        shapes.put("Ellipse", (params) -> new Ellipse(params[0], params[1], params[2], params[3]));
        shapes.put("Line", (params) -> new Line(params[0], params[1], params[2], params[3]));
        shapes.put("Rectangle", (params) -> new Rectangle(params[0], params[1], params[2], params[3]));
        shapes.put("Square", (params) -> new Square(params[0], params[1], params[2]));
    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }
}
