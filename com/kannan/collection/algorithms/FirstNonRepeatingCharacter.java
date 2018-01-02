package com.kannan.collection.algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Kannan Dharmalingam
 */
public class FirstNonRepeatingCharacter {

    private class CharCount {
        int count;

        public CharCount(int count) {
            this.count = count;
        }

        public void increaseCount() {
            count++;
        }
    }
    public static void main(String[] args) {
        FirstNonRepeatingCharacter ob = new FirstNonRepeatingCharacter();
        char c = ob.findFirstNonRepeatingCharacter("Character");
        System.out.println(c);
    }

    /**
     * 1. LinkedHashMap maintains order
     * 2. construct hashmap with key as char and value as word count, after loop through the String length and each char count > 1, take the first occurance
     * @param value
     * @return
     */
    private char findFirstNonRepeatingCharacter(String value) {
        Map<Character, CharCount> map = new LinkedHashMap<>();

        for(char c : value.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.get(c).increaseCount();
            } else {
                map.put(c, new CharCount(1));
            }
        }

        for (Map.Entry<Character, CharCount> entry : map.entrySet()) {
            if (entry.getValue().count == 1) {
                return entry.getKey();
            }
        }

        return '-';
    }
}
