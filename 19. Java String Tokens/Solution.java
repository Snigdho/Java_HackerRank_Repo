// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        if (s.trim().length() == 0) {
            System.out.println(0);
        } else {
            String[] stringParts = s.trim().split("[!,?._'@\\s]+");
            System.out.println(stringParts.length);
            for (String value : stringParts) {
                System.out.println(value);
            }
        }
    }
}
