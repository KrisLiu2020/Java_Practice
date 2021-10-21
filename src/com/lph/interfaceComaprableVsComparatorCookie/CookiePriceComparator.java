package com.lph.interfaceComaprableVsComparatorCookie;

import java.util.Comparator;

public class CookiePriceComparator implements Comparator<Cookie> {
    @Override
    public int compare(Cookie o1, Cookie o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
