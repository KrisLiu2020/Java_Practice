package com.lph.interfaceCompareToVsComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopSorter {

    public static void main(String[] args) {
//        LaptopPriceComparator priceCom = new LaptopPriceComparator();
        LaptopBrandComparator brandCom = new LaptopBrandComparator();
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 16, 800.0));
        laptops.add(new Laptop("Apple", 32, 1500.0));
        laptops.add(new Laptop("Acer", 8, 700.0));

        for(Laptop laptop: laptops) {
            System.out.println(laptop);
        }

        Collections.sort(laptops, brandCom);

        System.out.println("After sorting: ");

        for(Laptop laptop: laptops) {
            System.out.println(laptop);
        }
    }
}
