package com.lph.interfaceComaprableVsComparatorCookie;

import java.util.Objects;

public class Cookie implements Comparable<Cookie>{ // no implements Comparable<Cookie> here, uses Comparator Interface

    private String flavor;
    private int piecesInPackage;
    private double price;

    public Cookie(String flavor, int piecesInPackage, double price) {
        this.flavor = flavor;
        this.piecesInPackage = piecesInPackage;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPiecesInPackage() {
        return piecesInPackage;
    }

    public void setPiecesInPackage(int piecesInPackage) {
        this.piecesInPackage = piecesInPackage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "flavor='" + flavor + '\'' +
                ", piecesInPackage=" + piecesInPackage +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cookie cookie = (Cookie) o;
        return piecesInPackage == cookie.piecesInPackage && Double.compare(cookie.price, price) == 0 && Objects.equals(flavor, cookie.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, piecesInPackage, price);
    }

    @Override
    public int compareTo(Cookie o) {
        return Integer.compare(this.getPiecesInPackage(), o.getPiecesInPackage());
    }
}
