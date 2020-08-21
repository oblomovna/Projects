package com.telran;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tarakan implements Runnable {

    private static final int FASTER_STEP = 50;
    private static final int LONGEST_STEP = 100;

    String name;
    int stepsNum;
    List<Score> scores;
    Random random = new Random();

    public Tarakan(int stepsNum, String name, List<Score> scores) {
        this.stepsNum = stepsNum;
        this.name = name;
        this.scores = scores;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < stepsNum; i++) {
            int stepLength = random.nextInt(LONGEST_STEP - FASTER_STEP) + FASTER_STEP;
            try {
                Thread.sleep(stepLength);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long finish = System.currentTimeMillis();

        synchronized (scores) {
            scores.add(new Score(name, (int) (finish - start)));
        }
    }
}
