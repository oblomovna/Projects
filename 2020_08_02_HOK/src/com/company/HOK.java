package com.company;

public class HOK {
    public int nod(int a, int b) {
        if (b == 0)
            return a;
        int d = a % b;
        return nod(b, d);
    }

    public int hok(int a, int b) {
        return a*b/nod(a,b);

    }
}
