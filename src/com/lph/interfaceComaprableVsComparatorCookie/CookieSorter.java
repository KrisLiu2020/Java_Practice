package com.lph.interfaceComaprableVsComparatorCookie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CookieSorter {

    public static void main(String[] args) {
        CookieFlavorComparator pieceCom = new CookieFlavorComparator();
        CookiePriceComparator priceCom = new CookiePriceComparator();
        List<Cookie> cookieList = new ArrayList<>();
        cookieList.add(new Cookie("original", 2, 2.29));
        cookieList.add(new Cookie("vanilla", 3, 4.99));
        cookieList.add(new Cookie("chocolate", 1, 1.99));

        Collections.sort(cookieList, priceCom);

        for(Cookie cookie: cookieList) {
            System.out.println(cookie);
        }
    }


}