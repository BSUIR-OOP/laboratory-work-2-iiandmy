package by.ilya_budevich;

import by.ilya_budevich.model.Circle;
import by.ilya_budevich.model.Line;
import by.ilya_budevich.model.Rectangle;
import by.ilya_budevich.view.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class App {
    private static MainFrame mainFrame;

    public static void main(String[] args) {
        setupApplication();
        new Figures(new Line(1, 1, 100, 50),
                    new Rectangle(50, 5, 100, 150),
                    new Circle(5, 250, 50)
        ).drawFigures();
    }

    public static void setupApplication() {
        mainFrame = MainFrame.getInstance();
    }

    public static class Figures {
        private java.util.List<Shape> array;

        public Figures(Shape ...figures) {
            array = Arrays.asList(figures);
        }

        public boolean addFigure(Shape figure) {
            return array.add(figure);
        }

        public List<Shape> getFigures() { return array; }

        public void drawFigures() {
            JPanel drawPanel = mainFrame.getDrawPanel();
            array.forEach((figure) -> {
                System.out.println(figure);
                mainFrame.getDrawPanel().drawComponent(figure);
            });
        }
    }
}
