package com.telran;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static <Scores> void main(String[] args) throws InterruptedException {


        //Initialize scores list. Then initialize and start all tarakans.
        //Then join all tarakans. Then print the scores out.


        List<Scores> scores = new ArrayList<>();


        Tarakan t1 = new Tarakan("Vasya", 10, (List<Score>) scores);
        Tarakan t2 = new Tarakan("Petya", 10, (List<Score>) scores);
        Tarakan t3 = new Tarakan("Masha", 10, (List<Score>) scores);
        Tarakan t4 = new Tarakan("Fedya", 10, (List<Score>) scores);
        Tarakan t5 = new Tarakan("Tolya", 10, (List<Score>) scores);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        Thread th4 = new Thread(t4);
        Thread th5 = new Thread(t5);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        th1.join();
        th2.join();
        th3.join();
        th4.join();
        th5.join();

    }
}
