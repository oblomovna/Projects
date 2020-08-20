package com.telran;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tarakan implements Runnable {

    private static final int FASTER_STEP = 50;
    private static final int LONGEST_STEP = 100;

    String name;
    int stepNum;
    List<Score> scores;
    double random;
    //Random random = new Random();

    public Tarakan(String name, int stepNum, List<Score> scores) {
        this.name = name;
        this.stepNum = stepNum;
        this.scores = scores;
        this.random = Math.random() * (LONGEST_STEP - FASTER_STEP) + FASTER_STEP;
    }


    public static int getFasterStep() {
        return FASTER_STEP;
    }

    public static int getLongestStep() {
        return LONGEST_STEP;
    }


    @Override
    public void run() {
        double result = 0;
        for (int i = 0; i < stepNum; i++) {
            result += random;
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scores.add(new Score(name, result));
        System.out.println(name);
        System.out.println(result);


    }
}

