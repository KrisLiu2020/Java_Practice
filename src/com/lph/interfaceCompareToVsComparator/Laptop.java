package com.lph.interfaceCompareToVsComparator;

import java.util.Objects;

public class Laptop implements Comparable<Laptop>{

    private String brand;
    private int ram;
    private double price;

    public Laptop(final String brand, final int ram, final double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && Double.compare(laptop.price, price) == 0 && Objects.equals(brand, laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, price);
    }


    @Override
    public int compareTo(Laptop otherLaptop) {
        // for double datatype
        if (this.getPrice() - otherLaptop.getPrice() > 0) {
            return 1;
        } else if (this.getPrice() - otherLaptop.getPrice() == 0) {
            return 0;
        } else {
            return -1;
        }
//        return Integer.compare(this.getRam(), otherLaptop.getRam());
    }
}
