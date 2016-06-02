package net.verstarr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // open file "geometry.txt" for reading
        String path = new File(".").getAbsolutePath();
        File file = new File(path + "\\src\\net\\verstarr\\triangle.txt");
        Scanner input = new Scanner(file);

        // read the coordinates of the vertices R, S, and T
        double Rx = input.nextDouble ();
        double Ry = input.nextDouble ();

        double Sx = input.nextDouble ();
        double Sy = input.nextDouble ();

        double Tx = input.nextDouble ();
        double Ty = input.nextDouble ();

        Point R = new Point (Rx, Ry);
        Point S = new Point (Sx, Sy);
        Point T = new Point (Tx, Ty);

        Triangle RST = new Triangle (R, S, T);
        System.out.println ("Vertices of LINE RST: " + RST.toString ());
        System.out.println("LINE RST is a triangle: " + RST.isTriangle());
        System.out.println("LINE RST is an EQUILATERAL triangle: " + RST.isEquilateral());
        System.out.println("LINE RST is an ACUTE triangle: " + RST.isAcute());
        System.out.println("LINE RST is an OBTUSE triangle: " + RST.isObtuse());
        System.out.println("LINE RST is a RIGHT triangle: " + RST.isRight() + "\n");

        // read the coordinates of the vertices J, K, and L
        double Jx = input.nextDouble ();
        double Jy = input.nextDouble ();

        double Kx = input.nextDouble ();
        double Ky = input.nextDouble ();

        double Lx = input.nextDouble ();
        double Ly = input.nextDouble ();

        Point J = new Point (Jx, Jy);
        Point K = new Point (Kx, Ky);
        Point L = new Point (Lx, Ly);

        Triangle JKL = new Triangle (J, K, L);
        System.out.println ("Vertices of RIGHT triangle JKL: " + JKL.toString ());
        System.out.println("TRIANGLE JKL is a triangle: " + JKL.isTriangle());
        System.out.println("TRIANGLE JKL is an EQUILATERAL triangle: " + JKL.isEquilateral());
        System.out.println("TRIANGLE JKL is an ACUTE triangle: " + JKL.isAcute());
        System.out.println("TRIANGLE JKL is an OBTUSE triangle: " + JKL.isObtuse());
        System.out.println("TRIANGLE JKL is a RIGHT triangle: " + JKL.isRight() + "\n");

        // read the coordinates of the vertices A, B, and C
        double Ax = input.nextDouble ();
        double Ay = input.nextDouble ();

        double Bx = input.nextDouble ();
        double By = input.nextDouble ();

        double Cx = input.nextDouble ();
        double Cy = input.nextDouble ();

        Point A = new Point (Ax, Ay);
        Point B = new Point (Bx, By);
        Point C = new Point (Cx, Cy);

        Triangle ABC = new Triangle (A, B, C);
        System.out.println ("Vertices of ACUTE triangle ABC: " + ABC.toString ());
        System.out.println("TRIANGLE ABC is a triangle: " + ABC.isTriangle());
        System.out.println("TRIANGLE ABC is an EQUILATERAL triangle: " + ABC.isEquilateral());
        System.out.println("TRIANGLE ABC is an ACUTE triangle: " + ABC.isAcute());
        System.out.println("TRIANGLE ABC is an OBTUSE triangle: " + ABC.isObtuse());
        System.out.println("TRIANGLE ABC is a RIGHT triangle: " + ABC.isRight() + "\n");

        // read the coordinates of the vertices D, E, and F
        double Dx = input.nextDouble ();
        double Dy = input.nextDouble ();

        double Ex = input.nextDouble ();
        double Ey = input.nextDouble ();

        double Fx = input.nextDouble ();
        double Fy = input.nextDouble ();

        Point D = new Point (Dx, Dy);
        Point E = new Point (Ex, Ey);
        Point F = new Point (Fx, Fy);

        Triangle DEF = new Triangle (D, E, F);
        System.out.println ("Vertices of OBTUSE triangle DEF: " + DEF.toString ());
        System.out.println("TRIANGLE DEF is a triangle: " + DEF.isTriangle());
        System.out.println("TRIANGLE DEF is an EQUILATERAL triangle: " + DEF.isEquilateral());
        System.out.println("TRIANGLE DEF is an ACUTE triangle: " + DEF.isAcute());
        System.out.println("TRIANGLE DEF is an OBTUSE triangle: " + DEF.isObtuse());
        System.out.println("TRIANGLE DEF is a RIGHT triangle: " + DEF.isRight() + "\n");

        System.out.println("For EQUILATERAL triangles, third points are difficult to present in txt format.\nTry some of these sets:");
        System.out.println("(4,0), (-6,0), (-1, 5 * Math.sqrt(3))");
        System.out.println("(4,0), (-6,0), (-1, -5 * Math.sqrt(3))\n");

        // read the coordinates of the vertices D, E, and F
        double Xx = 4.0;
        double Xy = 0.0;

        double Yx = -6.0;
        double Yy = 0.0;

        double Zx = -1.0;
        double Zy = -5 * Math.sqrt(3);

        Point X = new Point (Xx, Xy);
        Point Y = new Point (Yx, Yy);
        Point Z = new Point (Zx, Zy);

        Triangle XYZ = new Triangle (X, Y, Z);
        System.out.println ("Vertices of EQUILATERAL (also ACUTE) triangle XYZ: " + XYZ.toString ());
        System.out.println("TRIANGLE XYZ is a triangle: " + XYZ.isTriangle());
        System.out.println("TRIANGLE XYZ is an EQUILATERAL triangle: " + XYZ.isEquilateral());
        System.out.println("TRIANGLE XYZ is an ACUTE triangle: " + XYZ.isAcute());
        System.out.println("TRIANGLE XYZ is an OBTUSE triangle: " + XYZ.isObtuse());
        System.out.println("TRIANGLE XYZ is a RIGHT triangle: " + XYZ.isRight() + "\n");

        // close file "geometry.txt"
        input.close ();
    }
}
