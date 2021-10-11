package com.lph.abstraction.Shape2D;

public class Circle extends Shape2D{

    private final double radius;
    private static final double PI = 3.141592525;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public double getArea(){

        return 0.0;
    }

    @Override
    public double getPerimeter() {

        return 0.0;
    }
}
