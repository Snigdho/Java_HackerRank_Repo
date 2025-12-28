// https://www.hackerrank.com/challenges/java-int-to-string/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            String s = String.valueOf(x);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        } finally {
            scan.close();
        }
    }
}
