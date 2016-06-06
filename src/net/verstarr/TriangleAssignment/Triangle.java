package net.verstarr.TriangleAssignment;

/**
 * Created by Ver Andrew Starr on 5/31/2016.
 */
public class Triangle extends Shape {
    // Triangle vertices
    private Point v1;
    private Point v2;
    private Point v3;
    private double d1;
    private double d2;
    private double d3;
    private boolean isTriangle;

    // Default triangle
    // Constructs a valid triangle
    public Triangle() {
        v1 = new Point(0, 0);
        v2 = new Point(1, 0);
        v3 = new Point(0, 1);
        d1 = v1.distance(v2);
        d2 = v1.distance(v3);
        d3 = v2.distance(v3);
        setTriangle(isTriangle(v1, v2, v3));

    }

    // Custom triangle by Points
    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        d1 = this.v1.distance(this.v2);
        d2 = this.v1.distance(this.v3);
        d3 = this.v2.distance(this.v3);
        setTriangle(isTriangle(v1, v2, v3));

    }

    // Custom triangle by manual Point input
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
        d1 = v1.distance(v2);
        d2 = v1.distance(v3);
        d3 = v2.distance(v3);
        setTriangle(isTriangle(v1, v2, v3));

    }

    public Point getVertex1() {
        return v1;
    }

    public void setVertex1(Point v1) {
        this.v1 = v1;
    }

    public void setVertex1(double x1, double y1) {
        v1 = new Point(x1, y1);
    }

    public Point getVertex2() {
        return v2;
    }

    public void setVertex2(Point v2) {
        this.v2 = v2;
    }

    public void setVertex2(double x2, double y2) {
        v2 = new Point(x2, y2);
    }

    public Point getVertex3() {
        return v3;
    }

    public void setVertex3(Point v3) {
        this.v3 = v3;
    }

    public void setVertex3(double x3, double y3) {
        v3 = new Point(x3, y3);
    }

    public void setTriangle(boolean triangle) {
        isTriangle = triangle;
    }

    /**
     * Validates if three points form a triangle
     **/
    public boolean isTriangle() {
        return d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1;
    }

    private boolean isTriangle(Point v1, Point v2, Point v3) {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        return d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1;
    }

    private boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);

        double d1 = p1.distance(p2);
        double d2 = p1.distance(p3);
        double d3 = p2.distance(p3);

        return d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1;
    }

    /**
     * Triangle is equilateral
     * (All sides are the same length => all angles are the same)
     **/
    public boolean isEquilateral() {
        return isTriangle && Math.abs(d1 - d2) < 1.0e-13 && Math.abs(d1 - d3) < 1.0e-13 && Math.abs(d2 - d3) < 1.0e-13;
    }

    /**
     * Triangle is acute
     * Finds the dot product for each point
     **/
    public boolean isAcute() {
        double dotAB = (v1.getX() - v3.getX()) * (v2.getX() - v3.getX()) + (v1.getY() - v3.getY()) * (v2.getY() - v3.getY());
        double dotBC = (v2.getX() - v1.getX()) * (v3.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v3.getY() - v1.getY());
        double dotAC = (v1.getX() - v2.getX()) * (v3.getX() - v2.getX()) + (v1.getY() - v2.getY()) * (v3.getY() - v2.getY());

        return isTriangle && dotAB * dotAC * dotBC > 0;

    }


    /**
     * Triangle is obtuse
     * Finds the dot product for each point
     **/
    public boolean isObtuse() {
        double dotAB = (v1.getX() - v3.getX()) * (v2.getX() - v3.getX()) + (v1.getY() - v3.getY()) * (v2.getY() - v3.getY());
        double dotBC = (v2.getX() - v1.getX()) * (v3.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v3.getY() - v1.getY());
        double dotAC = (v1.getX() - v2.getX()) * (v3.getX() - v2.getX()) + (v1.getY() - v2.getY()) * (v3.getY() - v2.getY());

        return isTriangle && dotAB * dotAC * dotBC < 0;

    }


    /**
     * Triangle is right
     * (a^2 + b^2 = c^2)
     **/
    public boolean isRight() {
        double a;
        double b;
        double c = Math.max(Math.max(d1, d2), d3);
        if (c == d1) {
            a = d2;
            b = d3;
        } else if (c == d2) {
            a = d1;
            b = d3;
        } else if (c == d3) {
            a = d1;
            b = d2;
        } else {
            return false;
        }

        return isTriangle && Math.abs(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) < 1.0e-13;

    }


    public String toString() {
        return v1.toString() + ", " + v2.toString() + ", " + v3.toString();
    }


    /**
     * Area and perimeter calculations
     **/
    @Override
    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (d1 + d2 + d3) / 2, or 1/2 of the perimeter of the triangle
        double s = (d1 + d2 + d3) / 2;
        return Math.sqrt(s * (s - d1) * (s - d2) * (s - d3));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        return d1 + d2 + d3;
    }
}
