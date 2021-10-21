package com.lph.interfaceCompareToVsComparator;

import java.util.Comparator;

public class LaptopBrandComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}
