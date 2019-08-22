package com.cqupt.sirius.algorithmExample.chapter2;

public class GCD {
    public static long gcd(long m, long n){
        while (n!=0){
            long rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }
}
