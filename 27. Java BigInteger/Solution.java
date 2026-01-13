// https://www.hackerrank.com/challenges/java-biginteger/problem

import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n1 = scan.nextBigInteger();
        BigInteger n2 = scan.nextBigInteger();
        scan.close();
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}
