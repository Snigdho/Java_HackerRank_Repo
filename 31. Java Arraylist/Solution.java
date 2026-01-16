// https://www.hackerrank.com/challenges/java-arraylist/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
            int d = scan.nextInt();
            while (d-- > 0) {
                arr.get(i).add(scan.nextInt());
            }
        }

        int numberOfQueries = scan.nextInt();
        while (numberOfQueries-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > 0 && x <= n) {
                System.out.println(
                    y > 0 && y <= arr.get(x - 1).size()
                        ? arr.get(x - 1).get(y - 1)
                        : "ERROR!"
                );
            } else {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}
