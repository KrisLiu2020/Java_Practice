package com.lph.interfaceTest.flyable;

public class InterfaceTest {

    public static void main(String[] args) {

        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
    }

}

interface Flyable {

    //public static final constants
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 1;

    //abstract methods
    public abstract void fly();
    // public static skipped
    void stop();
}

// Class implements the interface
class Plane implements Flyable {

    public void fly() {
        System.out.println("A plane is flying.");
    }

    public void stop() {
        System.out.println("A plane must be able to stop.");
    }
}
