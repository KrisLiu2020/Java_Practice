package com.lph.abstraction.Shape2D;

public class RegularPolygon extends Polygon{

    private final double length;
    private final double apothem;

    public RegularPolygon(int numOfSides, double length, double apothem) {
        super(numOfSides);
        this.length = length;
        this.apothem = apothem;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a regular polygon.");
    }

    @Override
    public double getPerimeter(){
        return this.getNumOfSides() * length;
    }

    @Override
    public double getArea() {
        double perimeter = this.getPerimeter();
        return 0.5 * apothem * length * perimeter;
    }

    public double getLength() {
        return this.length;
    }

    public double getApothem() {
        return this.apothem;
    }
}
