package com.smartJob.demo;

import java.util.Random;

public class Random2 {

    public static void main(String[] args) {
        Random random = new Random(441287210);

        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(10) + " ");
        }
    }
}
