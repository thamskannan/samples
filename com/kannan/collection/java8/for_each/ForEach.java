package com.kannan.collection.java8.for_each;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kannan Dharmalingam
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("M1");
        names.add("M2");
        names.add("R1");
        names.add("M3");
        names.add("G1");
        /* forEach with Stream - the output would be in same order
         * Output: M1, M2, M3
         */
        System.out.println("Print using forEach");
        names.stream()
                .filter(f->f.startsWith("M"))
                .forEach(System.out::println);

        /* forEach with Parallel Stream - the output would be in any order
         * Output: M2, M1, M3
         */
        System.out.println("Print using forEach");
        names.parallelStream()
                .filter(f->f.startsWith("M"))
                .forEach(System.out::println);

        /* forEachOrdered with Parallel Stream - the output would always be in this order:
         * M1, M2, M3
         */
        System.out.println("Print using forEachOrdered");
        names.parallelStream()
                .filter(f->f.startsWith("M"))
                .forEachOrdered(System.out::println);
    }
}
