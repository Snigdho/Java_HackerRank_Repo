// https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        scan.close();

        // Both the smallest and the largest are initialized as the the first possible alphabets
        // Given that k is greater than or equal to lenght of s
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        int stringLength = s.length();
        String tempString = "";
        for (int i = 1; i <= (stringLength - k); i++) {
            tempString = s.substring(i, i + k);
            if (tempString.compareTo(smallest) < 0) {
                smallest = tempString;
            }
            if (tempString.compareTo(largest) > 0) {
                largest = tempString;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
