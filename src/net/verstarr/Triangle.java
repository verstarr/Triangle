package net.verstarr;

/**
 * Created by Ver Andrew Starr on 5/31/2016.
 */
public class Triangle extends Shape {
    // Triangle vertices
    private Point v1;
    private Point v2;
    private Point v3;

    // Default triangle
    // Constructs a valid triangle
    public Triangle() {
        v1 = new Point(0, 0);
        v2 = new Point(1, 0);
        v3 = new Point(0, 1);
    }

    // Custom triangle by Points
    public Triangle(Point v1, Point v2, Point v3) {
        if (!isTriangle(v1, v2, v3)) {
            throw new IllegalArgumentException("These points do not form a triangle");
        }
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Custom triangle by manual Point input
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (!isTriangle(x1, y1, x2, y2, x3, y3)) {
            throw new IllegalArgumentException("These coordinates do not make points that form a triangle");
        }
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
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

    /**
     * Validates if three points form a triangle
     **/
    public boolean isTriangle() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

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
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        return d1 == d2 && d1 == d3 && d2 == d3;
    }

    /**
     * Triangle is acute
     * (a^2 + b^2 > c^2)
     **/
    public boolean isAcute() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);
        double a = 0;
        double b = 0;
        double c = Math.max(Math.max(d1, d2), d3);
        if (c == d1) {
            a = d2;
            b = d3;
        }
        else if (c == d2) {
            a = d1;
            b = d3;
        }
        else if (c == d3) {
            a = d1;
            b = d2;
        }
        else {
            return false;
        }

        return Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2);
    }


    /**
     * Triangle is obtuse
     * (a^2 + b^2 < c^2)
     **/
    public boolean isObtuse() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);
        double a = 0;
        double b = 0;
        double c = Math.max(Math.max(d1, d2), d3);
        if (c == d1) {
            a = d2;
            b = d3;
        }
        else if (c == d2) {
            a = d1;
            b = d3;
        }
        else if (c == d3) {
            a = d1;
            b = d2;
        }
        else {
            return false;
        }

        return Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2);
    }


    /**
     * Triangle is right
     * (a^2 + b^2 = c^2)
     **/
    public boolean isRight() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);
        double a = 0;
        double b = 0;
        double c = Math.max(Math.max(d1, d2), d3);
        if (c == d1) {
            a = d2;
            b = d3;
        }
        else if (c == d2) {
            a = d1;
            b = d3;
        }
        else if (c == d3) {
            a = d1;
            b = d2;
        }
        else {
            return false;
        }

        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }


    /**
     * Area and perimeter calculations
     **/
    @Override
    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v1.distance(v3);

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        // P = a + b + c
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v1.distance(v3);
        return a + b + c;
    }
}
