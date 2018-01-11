package com.kannan.collection.algorithms;

public class MyLongSubstring {

    public static void main(String[] args) {
        findLongSubString();
        reverseStringOfIntegers();
        countCharOccuranceOfString();
        getPhoneNumberFromCharNumber();
    }

    public static void countCharOccuranceOfString() {
        String s = "abcddeeet12132235";
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();

        for (Character c : s.toCharArray()) {
            //for (int i = 0; i < s.length(); i++) {
            //Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map); // O/p --> {a=1, 1=2, b=1, 2=3, c=1, 3=2, d=2, t=1, e=3, 5=1}
    }

    public static void reverseStringOfIntegers() {
        String s = "123456";

        java.util.List<Character> lst = new java.util.ArrayList<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            lst.add(s.charAt(i));
        }
        System.out.println(lst); // O/p --> [6, 5, 4, 3, 2, 1]
    }

    public static void findLongSubString() {
        String s = "ababcddee";

        java.util.List<Character> lst = new java.util.ArrayList<>();

        for (Character c : s.toCharArray()) {
            if (!lst.contains(c)) {
                lst.add(c);
            }
        }
        /*for (int i = 0; i < s.length(); i++) {
            if (!lst.contains(s.charAt(i))) {
                lst.add(s.charAt(i));
            }
        }*/

        System.out.println(lst); // O/p --> [a, b, c, d, e]
    }

    private static void getPhoneNumberFromCharNumber() {
        String s = "949wbe0zac";

        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            //for (int i = 0; i < s.length(); i++) {
            //Character c = s.charAt(i);

            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                switch (Character.toUpperCase(c)) {
                    case 'A': case 'B': case 'C':
                        sb.append(2); break;
                    case 'D': case 'E': case 'F':
                        sb.append(3); break;
                    case 'G': case 'H': case 'I':
                        sb.append(4); break;
                    case 'J': case 'K': case 'L':
                        sb.append(5); break;
                    case 'M': case 'N': case 'O':
                        sb.append(6); break;
                    case 'P': case 'Q': case 'R': case 'S':
                        sb.append(7); break;
                    case 'T': case 'U': case 'V':
                        sb.append(8); break;
                    case 'W': case 'X': case 'Y': case 'Z':
                        sb.append(9); break;
                    default:
                        sb.append('?');
                }
            }
        }
        System.out.println(sb.toString()); // O/p --> 9499230922
    }
}
