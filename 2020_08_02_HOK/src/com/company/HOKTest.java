package com.company;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HOKTest {

    HOK hok = new HOK();

    @Test
    public void testCompute_1and1_1(){
        assertEquals(1,hok.hok(1,1));
    }
    @Test
    public void testCompute_1and17_17(){
        assertEquals(17,hok.hok(1,17));
        assertEquals(17,hok.hok(17,1));
    }
    @Test
    public void testCompute_1and14_14(){
        assertEquals(14,hok.hok(1,14));
        assertEquals(14,hok.hok(14,1));
    }
    @Test
    public void testCompute_3and12_12(){
        assertEquals(12,hok.hok(3,12));
        assertEquals(12,hok.hok(12,3));
    }
    @Test
    public void testCompute_72and35_2520(){ //
        assertEquals(2520,hok.hok(72,35));
        assertEquals(2520,hok.hok(35,72));
    }
    @Test
    public void testCompute_54and24_216(){ //
        assertEquals(216,hok.hok(54,24));
        assertEquals(216,hok.hok(24,54));
    }
    @Test
    public void testCompute_500and600_3000(){ //
        assertEquals(3000,hok.hok(500,600));
        assertEquals(3000,hok.hok(600,500));
    }






}