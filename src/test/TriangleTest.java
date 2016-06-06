package test;

import net.verstarr.TriangleAssignment.Point;
import net.verstarr.TriangleAssignment.Triangle;

import static org.junit.Assert.*;

/**
 * Created by Ver Andrew Starr on 5/31/2016.
 */
public class TriangleTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("SETUP CLASS RUNNING...");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("TEARDOWN CLASS RUNNING...");
    }

    /**
     * Tests for isTriangle()
     * */

    /**
     * Tests Triangle() Default Constructor
     * */
    @org.junit.Test
    public void testIsTriangle() throws Exception {
        System.out.println("testIsTriangle: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle();
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle1() throws Exception {
        System.out.println("testIsTriangle: (0,0), (1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(1,0), new Point(0,-1));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle2() throws Exception {
        System.out.println("testIsTriangle: (0,0), (-1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,-1));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle3() throws Exception {
        System.out.println("testIsTriangle: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,1));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(Point v1, Point v2, Point v3) Constructor
     * */
    @org.junit.Test
    public void testIsTriangle4() throws Exception {
        System.out.println("testIsTriangle: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(4,0), new Point(-6,0), new Point(-1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle5() throws Exception {
        System.out.println("testIsTriangle: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(6,0), new Point(-4,0), new Point(1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle6() throws Exception {
        System.out.println("testIsTriangle: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle7() throws Exception {
        System.out.println("testIsTriangle: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle8() throws Exception {
        System.out.println("testIsTriangle: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(new Point(5,5), new Point(7,8), new Point(9,5));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle9() throws Exception {
        System.out.println("testIsTriangle: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(new Point(-5,5), new Point(-7,8), new Point(-9,5));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle10() throws Exception {
        System.out.println("testIsTriangle: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(new Point(-14,5), new Point(-7,8), new Point(-3,5));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle11() throws Exception {
        System.out.println("testIsTriangle: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(new Point(14,5), new Point(7,8), new Point(3,5));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(double x1, double y1, double x2, double y2, double x3, double y3) Constructor
     * */
    @org.junit.Test
    public void testIsTriangle12() throws Exception {
        System.out.println("testIsTriangle: (-10,11), (-7,12), (-4,13)");
        Triangle triangle = new Triangle(new Point(-10,11), new Point(-7,12), new Point(-4,13));
        boolean expResult = false;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle13() throws Exception {
        System.out.println("testIsTriangle: (10,11), (7,12), (4,13)");
        Triangle triangle = new Triangle(new Point(-10,11), new Point(-7,12), new Point(-4,13));
        boolean expResult = false;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle14() throws Exception {
        System.out.println("testIsTriangle: (0,0), (-15,0), (15,0)");
        Triangle triangle = new Triangle(new Point(-10,11), new Point(-7,12), new Point(-4,13));
        boolean expResult = false;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle15() throws Exception {
        System.out.println("testIsTriangle: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(4,0,-6,0,-1,5 * Math.sqrt(3));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle16() throws Exception {
        System.out.println("testIsTriangle: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(6,0,-4,0,1,5 * Math.sqrt(3));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle17() throws Exception {
        System.out.println("testIsTriangle: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle18() throws Exception {
        System.out.println("testIsTriangle: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle19() throws Exception {
        System.out.println("testIsTriangle: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(5,5,7,8,9,5);
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle20() throws Exception {
        System.out.println("testIsTriangle: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(-5,5,-7,8,-9,5);
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle21() throws Exception {
        System.out.println("testIsTriangle: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(-14,5,-7,8,-3,5);
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle22() throws Exception {
        System.out.println("testIsTriangle: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(14,5,7,8,3,5);
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle23() throws Exception {
        System.out.println("testIsTriangle: (0,0), (-15,0), (15,0)");
        Triangle triangle = new Triangle(-10,11,-7,12,-4,13);
        boolean expResult = false;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }


    /**
     * Tests for isEquilateral()
     * */

    /**
     * Tests Triangle() Default Constructor
     * */
    @org.junit.Test
    public void testIsEquilateral() throws Exception {
        System.out.println("testIsEquilateral: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle();
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral1() throws Exception {
        System.out.println("testIsEquilateral: (0,0), (1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(1,0), new Point(0,-1));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral2() throws Exception {
        System.out.println("testIsEquilateral: (0,0), (-1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,-1));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral3() throws Exception {
        System.out.println("testIsEquilateral: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,1));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(Point v1, Point v2, Point v3) Constructor
     * */
    @org.junit.Test
    public void testIsEquilateral4() throws Exception {
        System.out.println("testIsEquilateral: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(4,0), new Point(-6,0), new Point(-1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral5() throws Exception {
        System.out.println("testIsEquilateral: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(6,0), new Point(-4,0), new Point(1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral6() throws Exception {
        System.out.println("testIsEquilateral: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral7() throws Exception {
        System.out.println("testIsEquilateral: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral8() throws Exception {
        System.out.println("testIsEquilateral: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(new Point(5,5), new Point(7,8), new Point(9,5));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral9() throws Exception {
        System.out.println("testIsEquilateral: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(new Point(-5,5), new Point(-7,8), new Point(-9,5));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral10() throws Exception {
        System.out.println("testIsEquilateral: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(new Point(-14,5), new Point(-7,8), new Point(-3,5));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral11() throws Exception {
        System.out.println("testIsEquilateral: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(new Point(14,5), new Point(7,8), new Point(3,5));
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(double x1, double y1, double x2, double y2, double x3, double y3) Constructor
     * */
    @org.junit.Test
    public void testIsEquilateral12() throws Exception {
        System.out.println("testIsEquilateral: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(4,0,-6,0,-1,5 * Math.sqrt(3));
        boolean expResult = true;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilatera13() throws Exception {
        System.out.println("testIsEquilateral: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(6,0,-4,0,1,5 * Math.sqrt(3));
        boolean expResult = true;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilatera14() throws Exception {
        System.out.println("testIsEquilateral: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral15() throws Exception {
        System.out.println("testIsEquilateral: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral16() throws Exception {
        System.out.println("testIsEquilateral: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(5,5,7,8,9,5);
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral17() throws Exception {
        System.out.println("testIsEquilateral: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(-5,5,-7,8,-9,5);
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral18() throws Exception {
        System.out.println("testIsEquilateral: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(-14,5,-7,8,-3,5);
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral19() throws Exception {
        System.out.println("testIsEquilateral: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(14,5,7,8,3,5);
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    /**
     * Tested rounding for isEquilateral()
     * */
    @org.junit.Test
    public void testIsEquilateral20() throws Exception {
        System.out.println("testIsEquilateral: (0,4), (0,0), (Math.sqrt(12), 2)");
        Triangle triangle = new Triangle(new Point(0,4), new Point(0,0), new Point(Math.sqrt(12), 2));
        boolean expResult = true;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    /**
     * Tests for isAcute()
     * */

    /**
     * Tests Triangle() Default Constructor
     * */
    @org.junit.Test
    public void testIsAcute() throws Exception {
        System.out.println("testIsAcute: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle();
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute1() throws Exception {
        System.out.println("testIsAcute: (0,0), (1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(1,0), new Point(0,-1));
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute2() throws Exception {
        System.out.println("testIsAcute: (0,0), (-1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,-1));
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute3() throws Exception {
        System.out.println("testIsAcute: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,1));
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(Point v1, Point v2, Point v3) Constructor
     * */
    @org.junit.Test
    public void testIsAcute4() throws Exception {
        System.out.println("testIsAcute: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(4,0), new Point(-6,0), new Point(-1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute5() throws Exception {
        System.out.println("testIsAcute: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(6,0), new Point(-4,0), new Point(1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute6() throws Exception {
        System.out.println("testIsAcute: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute7() throws Exception {
        System.out.println("testIsAcute: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute8() throws Exception {
        System.out.println("testIsAcute: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(new Point(5,5), new Point(7,8), new Point(9,5));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute9() throws Exception {
        System.out.println("testIsAcute: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(new Point(-5,5), new Point(-7,8), new Point(-9,5));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute10() throws Exception {
        System.out.println("testIsAcute: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(new Point(-14,5), new Point(-7,8), new Point(-3,5));
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute11() throws Exception {
        System.out.println("testIsAcute: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(new Point(14,5), new Point(7,8), new Point(3,5));
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(double x1, double y1, double x2, double y2, double x3, double y3) Constructor
     * */
    @org.junit.Test
    public void testIsAcute12() throws Exception {
        System.out.println("testIsAcute: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(4,0,-6,0,-1,5 * Math.sqrt(3));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute13() throws Exception {
        System.out.println("testIsAcute: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(6,0,-4,0,1,5 * Math.sqrt(3));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute14() throws Exception {
        System.out.println("testIsAcute: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute15() throws Exception {
        System.out.println("testIsAcute: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute16() throws Exception {
        System.out.println("testIsAcute: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(5,5,7,8,9,5);
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute17() throws Exception {
        System.out.println("testIsAcute: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(-5,5,-7,8,-9,5);
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute18() throws Exception {
        System.out.println("testIsAcute: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(-14,5,-7,8,-3,5);
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute19() throws Exception {
        System.out.println("testIsAcute: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(14,5,7,8,3,5);
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute20() throws Exception {
        System.out.println("testIsAcute: (0,4), (0,0), (Math.sqrt(12), 2)");
        Triangle triangle = new Triangle(new Point(0,4), new Point(0,0), new Point(Math.sqrt(12), 2));
        boolean expResult = true;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    /**
     * Tests for isObtuse()
     * */

    /**
     * Tests Triangle() Default Constructor
     * */
    @org.junit.Test
    public void testIsObtuse() throws Exception {
        System.out.println("testIsObtuse: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle();
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse1() throws Exception {
        System.out.println("testIsObtuse: (0,0), (1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(1,0), new Point(0,-1));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse2() throws Exception {
        System.out.println("testIsObtuse: (0,0), (-1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,-1));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse3() throws Exception {
        System.out.println("testIsObtuse: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,1));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(Point v1, Point v2, Point v3) Constructor
     * */
    @org.junit.Test
    public void testIsObtuse4() throws Exception {
        System.out.println("testIsObtuse: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(4,0), new Point(-6,0), new Point(-1, 5 * Math.sqrt(3)));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse5() throws Exception {
        System.out.println("testIsObtuse: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(6,0), new Point(-4,0), new Point(1, 5 * Math.sqrt(3)));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse6() throws Exception {
        System.out.println("testIsObtuse: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse7() throws Exception {
        System.out.println("testIsObtuse: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse8() throws Exception {
        System.out.println("testIsObtuse: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(new Point(5,5), new Point(7,8), new Point(9,5));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse9() throws Exception {
        System.out.println("testIsObtuse: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(new Point(-5,5), new Point(-7,8), new Point(-9,5));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse10() throws Exception {
        System.out.println("testIsObtuse: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(new Point(-14,5), new Point(-7,8), new Point(-3,5));
        boolean expResult = true;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse11() throws Exception {
        System.out.println("testIsObtuse: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(new Point(14,5), new Point(7,8), new Point(3,5));
        boolean expResult = true;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(double x1, double y1, double x2, double y2, double x3, double y3) Constructor
     * */
    @org.junit.Test
    public void testIsObtuse12() throws Exception {
        System.out.println("testIsObtuse: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(4,0,-6,0,-1,5 * Math.sqrt(3));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse13() throws Exception {
        System.out.println("testIsObtuse: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(6,0,-4,0,1,5 * Math.sqrt(3));
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse14() throws Exception {
        System.out.println("testIsObtuse: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse15() throws Exception {
        System.out.println("testIsObtuse: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse16() throws Exception {
        System.out.println("testIsObtuse: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(5,5,7,8,9,5);
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse17() throws Exception {
        System.out.println("testIsObtuse: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(-5,5,-7,8,-9,5);
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse18() throws Exception {
        System.out.println("testIsObtuse: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(-14,5,-7,8,-3,5);
        boolean expResult = true;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse19() throws Exception {
        System.out.println("testIsObtuse: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(14,5,7,8,3,5);
        boolean expResult = true;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    /**
     * Tests for isRight()
     * */

    /**
     * Tests Triangle() Default Constructor
     * */
    @org.junit.Test
    public void testIsRight() throws Exception {
        System.out.println("testIsRight: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle();
        boolean expResult = true;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight1() throws Exception {
        System.out.println("testIsRight: (0,0), (1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(1,0), new Point(0,-1));
        boolean expResult = true;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight2() throws Exception {
        System.out.println("testIsRight: (0,0), (-1,0), (0,-1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,-1));
        boolean expResult = true;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight3() throws Exception {
        System.out.println("testIsRight: (0,0), (1,0), (0,1)");
        Triangle triangle = new Triangle(new Point(0,0), new Point(-1,0), new Point(0,1));
        boolean expResult = true;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(Point v1, Point v2, Point v3) Constructor
     * */
    @org.junit.Test
    public void testIsRight4() throws Exception {
        System.out.println("testIsRight: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(4,0), new Point(-6,0), new Point(-1, 5 * Math.sqrt(3)));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight5() throws Exception {
        System.out.println("testIsRight: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(new Point(6,0), new Point(-4,0), new Point(1, 5 * Math.sqrt(3)));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight6() throws Exception {
        System.out.println("testIsRight: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight7() throws Exception {
        System.out.println("testIsRight: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(new Point(0,-2), new Point(5,-1), new Point(4,-4));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight8() throws Exception {
        System.out.println("testIsRight: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(new Point(5,5), new Point(7,8), new Point(9,5));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight9() throws Exception {
        System.out.println("testIsRight: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(new Point(-5,5), new Point(-7,8), new Point(-9,5));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight10() throws Exception {
        System.out.println("testIsRight: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(new Point(-14,5), new Point(-7,8), new Point(-3,5));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight11() throws Exception {
        System.out.println("testIsRight: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(new Point(14,5), new Point(7,8), new Point(3,5));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    /**
     * Tests Triangle(double x1, double y1, double x2, double y2, double x3, double y3) Constructor
     * */
    @org.junit.Test
    public void testIsRight12() throws Exception {
        System.out.println("testIsRight: (4,0), (-6,0), (-1,5 * sqrt(3))");
        Triangle triangle = new Triangle(4,0,-6,0,-1,5 * Math.sqrt(3));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight13() throws Exception {
        System.out.println("testIsRight: (6,0), (-4,0), (1,5 * sqrt(3))");
        Triangle triangle = new Triangle(6,0,-4,0,1,5 * Math.sqrt(3));
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight14() throws Exception {
        System.out.println("testIsRight: (0,-2), (5,-1), (4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight15() throws Exception {
        System.out.println("testIsRight: (0,-2), (-5,-1), (-4,-4)");
        Triangle triangle = new Triangle(0,-2,5,-1,4,-4);
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight16() throws Exception {
        System.out.println("testIsRight: (5,5), (7,8), (9,5)");
        Triangle triangle = new Triangle(5,5,7,8,9,5);
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight17() throws Exception {
        System.out.println("testIsRight: (-5,5), (-7,8), (-9,5)");
        Triangle triangle = new Triangle(-5,5,-7,8,-9,5);
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight18() throws Exception {
        System.out.println("testIsRight: (-14,5), (-7,8), (-3,5)");
        Triangle triangle = new Triangle(-14,5,-7,8,-3,5);
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight19() throws Exception {
        System.out.println("testIsRight: (14,5), (7,8), (3,5)");
        Triangle triangle = new Triangle(14,5,7,8,3,5);
        boolean expResult = false;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }
}
