package by.ilya_budevich.model;

import by.ilya_budevich.model.ifc.SymmetricShape;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Ellipse2D implements SymmetricShape {
    private Point point;
    private double diameter;

    public Circle(double x, double y, double diameter) {
        this.point = new Point(x, y);
        this.diameter = diameter;
    }

    @Override
    @Deprecated
    public void setFrame(double x, double y, double w, double h) {
        this.point.setLocation(x, y);
        this.diameter = w;
    }

    public void setFrame(double x, double y, double d) {
        this.point.setLocation(x, y);
        this.diameter = d;
    }

    @Override
    public double getX() {
        return this.point.getX();
    }

    public double getDiameter() { return this.diameter; }

    @Override
    public double getY() {
        return this.point.getY();
    }
    
    @Override
    @Deprecated
    public double getWidth() {
        return this.diameter;
    }

    @Override
    @Deprecated
    public double getHeight() {
        return this.getWidth();
    }
    
    @Override
    public boolean isEmpty() {
        return false;
    }
    

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public String toString() {
        return "Circle[p=" + point + ", d=" + diameter + "]";
    }
    
}
