package by.ilya_budevich.model;

import by.ilya_budevich.model.ifc.SymmetricShape;

import java.awt.geom.Rectangle2D;

public class Square extends Rectangle2D implements SymmetricShape {
    private Point point;
    private double side;

    public Square(double x, double y, double side) {
        this.point = new Point(x, y);
        this.side = side;
    }

    public Square(Point point, double side) {
        this.point = point;
        this.side = side;
    }

    public void setRect(Point point, double side) {
        this.point.setLocation(point);
        this.side = side;
    }

    public void setRect(double x, double y, double side) {
        this.point.setLocation(x, y);
        this.side = side;
    }

    @Override
    @Deprecated
    public void setRect(double x, double y, double w, double h) {
        this.point.setLocation(x, y);
        this.side = w;
    }

    @Override
    public double getX() {
        return this.point.getX();
    }

    @Override
    public double getY() {
        return this.point.getY();
    }

    public double getSide() {
        return this.side;
    }

    @Override
    @Deprecated
    public double getWidth() {
        return this.side;
    }

    @Override
    @Deprecated
    public double getHeight() {
        return this.side;
    }

    @Override
    public String toString() {
        return "Square[p=" + point + ", side=" + side + "]";
    }

    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
