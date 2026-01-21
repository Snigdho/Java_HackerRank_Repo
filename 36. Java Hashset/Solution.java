// https://www.hackerrank.com/challenges/java-hashset/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        s.close();
        Set<Set<String>> stringPair = new HashSet<>();
        for (int i = 0; i < t; i++) {
            Set<String> temp = new HashSet<>();
            temp.add(pair_left[i]);
            temp.add(pair_right[i]);
            stringPair.add(temp);
            System.out.println(stringPair.size());
        }
    }
}
