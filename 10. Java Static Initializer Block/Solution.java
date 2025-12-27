// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();
        scan.close();
        boolean flag = true;

        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
