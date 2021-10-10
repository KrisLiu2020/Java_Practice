package com.lph.abstraction.DogLabYorkshire;

public class Yorkshire extends Dog {

    private static final int YORKSHIRE_WEIGHT = 4;
    private final boolean ratter;

    public Yorkshire(String name, boolean ratter) {
        super(name);
        this.ratter = ratter;
    }

    public boolean isRatter() {
        return this.ratter;
    }

    @Override
    public String speak() {
        return "YAPYAPYAP!";
    }

    @Override
    public double averageBreedWeightKG() {
        return YORKSHIRE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Yorkshire [ratter =" + ratter  + ", name =" + name + "]";
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
        Yorkshire otherYorkshire = (Yorkshire) other;
        return name.equals(otherYorkshire.getName()) && ratter == otherYorkshire.isRatter();
    }
}
