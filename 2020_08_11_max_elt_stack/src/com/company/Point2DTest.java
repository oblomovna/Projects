package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D point2D =new Point2D();
    DefaultIntegerComparator comparator = new DefaultIntegerComparator();
    Point2D point1;
    Point2D point2;

    @Test
    void testPoint2DComparator_1and1_zero() {
        double x1=3;
        double y1=3;
        double x2=4;
        double y2=4;
        Double r1 = Math.sqrt(x1*x1+y2*y2);
        Double r2 = Math.sqrt(x2*x2+y2*y2);
        assertEquals(-1, r1.compareTo(r2));
       // assertEquals(0, point1.compareTo(a));
        //assertEquals(0, comparator.compare(a, b));
    }
}