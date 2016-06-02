package net.verstarr.TriangleAssignment;

/**
 * Created by Ver Andrew Starr on 5/31/2016.
 */
public class Point {
    private double x;
    private double y;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Finds distance from this point to Point p
     * Distance formula
     **/
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
