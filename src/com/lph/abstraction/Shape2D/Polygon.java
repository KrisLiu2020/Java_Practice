package com.lph.abstraction.Shape2D;

public abstract class Polygon extends Shape2D{

    private final int numOfSides;

    public Polygon(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int getNumOfSides() {
        return this.numOfSides;
    }
}
