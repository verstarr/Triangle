package test;

import net.verstarr.Point;
import net.verstarr.Triangle;

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

    @org.junit.Test
    public void testIsTriangle() throws Exception {
        System.out.println("testIsTriangle");
        Triangle triangle = new Triangle();
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsTriangle1() throws Exception {
        System.out.println("testIsTriangle");
        Triangle triangle = new Triangle(new Point(4,0), new Point(-6,0), new Point(-1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isTriangle();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral() throws Exception {
        System.out.println("testIsEquilateral");
        Triangle triangle = new Triangle();
        boolean expResult = false;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsEquilateral1() throws Exception {
        System.out.println("testIsEquilateral");
        Triangle triangle = new Triangle(new Point(4,0), new Point(-6,0), new Point(-1, 5 * Math.sqrt(3)));
        boolean expResult = true;
        boolean result = triangle.isEquilateral();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsAcute() throws Exception {
        System.out.println("testIsEquilateral");
        Triangle triangle = new Triangle();
        boolean expResult = false;
        boolean result = triangle.isAcute();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsObtuse() throws Exception {
        System.out.println("testIsEquilateral");
        Triangle triangle = new Triangle();
        boolean expResult = false;
        boolean result = triangle.isObtuse();
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testIsRight() throws Exception {
        System.out.println("testIsEquilateral");
        Triangle triangle = new Triangle();
        boolean expResult = true;
        boolean result = triangle.isRight();
        assertEquals(expResult, result);
    }
}
