package by.ilya_budevich.model;

import java.awt.geom.Point2D;

public class Point extends Point2D {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() { return x; }
    @Override
    public double getY() { return y; }

    @Override
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public double getDistance(Point p2) {
        return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y ,2));
    }

    public boolean equals(Point point) {
        return this.x == point.x && this.y == point.y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
