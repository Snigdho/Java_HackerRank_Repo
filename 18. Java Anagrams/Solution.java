// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.setStringValues();
        if (anagram.isAnagram()) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}

class Anagram {

    private String a;
    private String b;

    public void setStringValues() {
        Scanner scan = new Scanner(System.in);
        this.a = scan.nextLine();
        this.b = scan.nextLine();
        scan.close();
    }

    public boolean isAnagram() {
        if (this.a.length() != this.b.length()) return false;

        String a = this.a.toLowerCase();
        String b = this.b.toLowerCase();
        HashMap<Character, Integer> charMap = new HashMap<>();
        int stringLength = a.length();

        for (int i = 0; i < stringLength; i++) {
            if (charMap.containsKey(a.charAt(i))) {
                charMap.put(a.charAt(i), (charMap.get(a.charAt(i)) + 1));
            } else {
                charMap.put(a.charAt(i), 1);
            }

            if (charMap.containsKey(b.charAt(i))) {
                charMap.put(b.charAt(i), (charMap.get(b.charAt(i)) - 1));
            } else {
                charMap.put(b.charAt(i), -1);
            }
        }
        /*
        // for debugging
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        */

        /*
        for (Character k : charMap.keySet()) {
            if (charMap.get(k) != 0) return false;
        }*/

        // optimized
        for (Integer value : charMap.values()) {
            if (value != 0) return false;
        }

        return true;
    }
}
