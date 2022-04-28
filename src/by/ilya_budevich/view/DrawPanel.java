package by.ilya_budevich.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {
    private List<Shape> shapesToDraw;

    public DrawPanel() {
        shapesToDraw = new ArrayList<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        shapesToDraw.forEach(g2::draw);
    }

    public void drawComponent(Shape component) {
        shapesToDraw.add(component);
        paintComponent(this.getGraphics());
    }
}
