// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfInputs = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numberOfInputs; i++) {
            String regex = scan.nextLine();
            try {
                "".split(regex);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}
