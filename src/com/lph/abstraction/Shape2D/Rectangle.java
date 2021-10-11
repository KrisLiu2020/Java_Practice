package com.lph.abstraction.Shape2D;

public class Rectangle extends Shape2D{

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
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
    public double getPerimeter(){

        return 0.0;
    }
}
