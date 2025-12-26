// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a;

        int i = 1;
        while (scan.hasNext()) {
            a = scan.nextLine();
            System.out.println(i + " " + a);
            i++;
        }
        scan.close();
    }
}
