// https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger bigInt = new BigInteger(n);
        System.out.println(bigInt.isProbablePrime(100) ? "prime" : "not prime");
    }
}
