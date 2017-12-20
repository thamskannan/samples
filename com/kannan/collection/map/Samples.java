package com.kannan.collection.map;

import com.kannan.collection.design_pattern.decorator_ex1.Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Kannan Dharmalingam
 */
public class Samples {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(3);
        s.add(2);
        s.add(null);
        s.add(null);
        s.add(3);
        s.add(4);
        System.out.println(s); //[null, 1, 2, 3, 4]

        Map<Integer, String> m = new HashMap<>();
        m.put(1, "5");
        m.put(5, "5");
        m.put(1, "1");
        m.put(3, "3");
        m.put(1, "1.1");
        m.put(null, "N");
        m.put(2, "2");
        m.put(3, "3.1");
        m.put(null, "N1");
        m.put(4, null);
        m.put(4, null);
        System.out.println(m); // {null=N1, 1=1.1, 2=2, 3=3.1, 4=null, 5=5}
    }
}

enum Singleton
{
    MAIN;

    // instance vars, constructor
    private final Main ob;

    Singleton()
    {
        // Initialize the ob
        System.out.println("---------Singleton Constructor");
        ob = new Main();
    }

    public Main getInstance()
    {
        return ob;
    }
}