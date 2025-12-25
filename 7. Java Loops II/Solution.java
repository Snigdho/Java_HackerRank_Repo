// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            long series = a;
            long bb = 1;
            for (int j = 0; j < n; j++) {
                series += bb * b;
                System.out.printf("%d ", series);
                bb *= 2;
            }
            System.out.printf("%n");
        }
        in.close();
    }
}
