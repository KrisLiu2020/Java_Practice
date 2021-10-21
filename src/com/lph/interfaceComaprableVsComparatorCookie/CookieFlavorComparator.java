package com.lph.interfaceComaprableVsComparatorCookie;

import java.util.Comparator;

public class CookieFlavorComparator implements Comparator<Cookie> {

    @Override
    public int compare(Cookie c1, Cookie c2) {
        return String.CASE_INSENSITIVE_ORDER.compare(c1.getFlavor(), c2.getFlavor());
    }

}
