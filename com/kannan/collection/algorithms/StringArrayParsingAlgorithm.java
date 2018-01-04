package com.kannan.collection.algorithms;

import java.util.HashMap;
import java.util.Map;

public class StringArrayParsingAlgorithm {
    private class Student {
        String name;
        Integer totalMark;
        Integer noOfSubjects;

        Student(String name, Integer totalMark, Integer noOfSubjects) {
            this.name = name;
            this.totalMark = totalMark;
            this.noOfSubjects = noOfSubjects;
        }

        Integer calculateAve() {
            return this.totalMark / this.noOfSubjects;
        }

        void setTotalMark(Integer totalMark) {
            this.noOfSubjects++;
            this.totalMark += totalMark;
        }
    }

    public static void main(String[] args) {
        String[][] tc1 = { { "Bobby", "87" },
                { "Charles", "100" },
                { "Eric", "64" },
                { "Charles", "22" } };
        StringArrayParsingAlgorithm ob = new StringArrayParsingAlgorithm();
        int avg = ob.calculateAverage(tc1);
        System.out.println(avg);
    }

    private int calculateAverage(String[][] tc1) {
        Map<String, Student> studentMap = new HashMap<>();
        for(String[] strings : tc1) {
            if (studentMap.containsKey(strings[0])) {
                Student student = studentMap.get(strings[0]);
                student.setTotalMark(Integer.parseInt(strings[1]));
                studentMap.get(strings[0]).setTotalMark(Integer.parseInt(strings[1]));
            } {
                studentMap.put(strings[0], new Student(strings[0], Integer.parseInt(strings[1]), 1));
            }
            /*if (studentMap.containsKey(strings[0])) {
                studentMap.get(strings[0]).setTotalMark(Integer.parseInt(strings[1]));
            } {
                studentMap.put(strings[0], new Student(strings[0], Integer.parseInt(strings[1]), 1));
            }*/
        }

        int maxAvg = 0;
        for (Map.Entry<String, Student> studentEntry : studentMap.entrySet()) {
            Integer avg = studentEntry.getValue().calculateAve();
            if (maxAvg < avg) {
                maxAvg = avg;
            }
        }
        return maxAvg;
    }

}
