// https://www.hackerrank.com/challenges/java-regex/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String ip = scan.next();
            String ipRegex =
                "^(0?\\d?\\d|1\\d\\d|2[0-4]\\d|25[0-5])(\\.(0?\\d?\\d|1\\d\\d|2[0-4]\\d|25[0-5])){3}$";
            System.out.println(ip.matches(ipRegex));
        }
        scan.close();
    }
}
