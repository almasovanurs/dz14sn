package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class clas = new Class(21, "Amanat", new int[]{23, 21, 4, 10});
        System.out.println(clas.getNumber());
        System.out.println(clas.getSoz());
        System.out.println(Arrays.toString(clas.getMassive()));


    }
}
