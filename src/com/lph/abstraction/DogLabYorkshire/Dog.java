package com.lph.abstraction.DogLabYorkshire;

import java.util.Objects;

public abstract class Dog {

    protected final String name;

    public Dog(String name) {
        if (name != null && name.trim().length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name can't be empty!");
        }
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        return "WOOF!";
    }

    public abstract double averageBreedWeightKG();

    @Override
    public String toString() {
        return "Dog [name =" + name  + ']';
    }

    /**
     * Dogs are equal if their names are equal.
     *
     * @param other Object
     * @return true if the same else false
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Dog dog = (Dog) other;
        return Objects.equals(name, dog.name);
    }

    /**
     * Returns a hashCode for this instance of the Dog class.
     *
     * @return hashCode as an int.
     */
    @Override
    public int hashCode() {
        return getName().hashCode();
    }


}
