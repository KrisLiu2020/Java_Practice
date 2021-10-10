package com.lph.abstraction.DogLabYorkshire;

public class DogTest {

    public static void main(final String[] args) {

        Labrador lab = new Labrador("Hannah", "Golden");
        Yorkshire yorkie = new Yorkshire("Sebastian", true);

        System.out.println(lab.getName() + "says " + lab.speak());
        System.out.println(lab.getName() + "weighs " + lab.averageBreedWeightKG());

        System.out.println(yorkie.getName() + "says " + yorkie.speak());
        System.out.println(yorkie.getName() + "weighs " + yorkie.averageBreedWeightKG());
    }
}
