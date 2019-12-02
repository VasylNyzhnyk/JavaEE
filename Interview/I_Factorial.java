package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class I_Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(reader.readLine());
        System.out.println(faktorial1(f));
    }

    private static Map<Integer, BigInteger> cache = new HashMap<>();

    private static BigInteger faktorial1(int f){
        BigInteger temp;

        if(f == 0) return BigInteger.ONE;
        if((temp = cache.get(f)) != null) return temp;
        temp = BigInteger.valueOf(f).multiply(faktorial1(f - 1));
        cache.put(f, temp);
        return temp;
    }
}
