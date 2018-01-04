package com.kannan.collection.example;

import java.util.*;

public class MemoryLeak {
    private Random random = new Random();
    public static final List<Double> list = new ArrayList<Double>(1000000);

    public static void main(String[] args) {
        String[][] tc1 = { { "Bobby", "87" },
                { "Charles", "100" },
                { "Eric", "64" },
                { "Charles", "22" } };
        for(String[] s: tc1) {
            System.out.println(s);

            HashMap<String, ArrayList> map = null;
            map.forEach((vv, v) -> System.out.println());
        }
    }
}
