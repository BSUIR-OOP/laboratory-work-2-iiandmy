package by.ilya_budevich.model;

import by.ilya_budevich.model.ifc.RegularShape;

import java.awt.geom.Rectangle2D;

public class Rectangle extends Rectangle2D implements RegularShape {
    private Point point;
    private double width;
    private double height;

    public Rectangle(double x, double y, double w, double h) {
        this.point = new Point(x, y);
        this.width = w;
        this.height = h;
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    @Override
    public void setRect(double x, double y, double w, double h) {
        this.point.setLocation(x, y);
        this.width = w;
        this.height = h;
    }

    @Override
    public String toString() {
        return "Rectangle[p=" + this.point + ", w=" + this.width + ", h=" + this.height + "]";
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }
}
