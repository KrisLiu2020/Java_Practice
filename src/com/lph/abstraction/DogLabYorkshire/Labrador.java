package com.lph.abstraction.DogLabYorkshire;

public class Labrador extends Dog {

    private static final int LABRADOR_WEIGHT = 35;
    private final String colour;

    public Labrador(String name, String colour) {
        super(name);
        if (colour != null && colour.trim().length() > 0) {
            this.colour = colour;
        } else {
            throw new IllegalArgumentException("Colour cannot be empty!");
        }
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public String speak() {
        return "BOW BOW!";
    }

    @Override
    public double averageBreedWeightKG() {
        return LABRADOR_WEIGHT;
    }

    @Override
    public String toString() {
        return "Labrador [color=" + colour + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!this.getClass().equals(other.getClass())) {
            return false;
        }
        Labrador otherLab = (Labrador) other;
        return this.getName().equals(otherLab.getName()) && this.colour.equals(otherLab.getColour());
    }
}