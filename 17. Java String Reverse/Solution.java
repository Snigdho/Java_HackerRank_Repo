// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String reversed = new StringBuilder(s).reverse().toString();
        if (s.compareTo(reversed) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
