package com.company;

import java.util.Comparator;

public class Point2D implements Comparable<Double> {
    double x1;
    double y1;
    double x2;
    double y2;
    Comparator<Double> comparator;

    public Point2D() { //Comparator<Double> comparator
        this.comparator = comparator;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }


      Double r1 = rad(x1,y1);
      Double r2 = rad(x2,y2);



   public double rad(double x, double y){
        Double r = Math.sqrt(x*x+y*y);
        return r;
    }

    @Override
    public int compareTo(Double o) {
        return r1.compareTo(r2);
    }
}





