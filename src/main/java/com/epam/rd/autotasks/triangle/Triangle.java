package com.epam.rd.autotasks.triangle;

class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        // Check if the triangle exists and is not degenerate
        if (!triangleExists()) {
            throw new IllegalArgumentException("Triangle does not exist or is degenerate");
        }
    }

    private boolean triangleExists() {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        // Check if the vertices are not collinear
        return (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) != 0;
    }

    public double area() {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        // Calculate the area of the triangle using Shoelace formula
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

    public Point centroid() {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        // Calculate the centroid coordinates
        double centroidX = (x1 + x2 + x3) / 3.0;
        double centroidY = (y1 + y2 + y3) / 3.0;

        return new Point(centroidX, centroidY);
    }
}
