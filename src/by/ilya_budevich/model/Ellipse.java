package by.ilya_budevich.model;

import by.ilya_budevich.model.ifc.RegularShape;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ellipse extends Ellipse2D implements RegularShape {
    private Point point;
    private double width;
    private double height;

    public Ellipse(double x, double y, double w, double h) {
        this.point = new Point(x, y);
        this.width = w;
        this.height = h;
    }

    @Override
    public double getX() {
        return this.point.getX();
    }

    @Override
    public double getY() {
        return this.point.getY();
    }

    public Point getPoint() {
        return this.point;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Ellipse[p=" + this.point + ", w=" + this.width + ", h=" + this.height + "]";
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {
        this.point.setLocation(x, y);
        this.width = w;
        this.height = h;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
