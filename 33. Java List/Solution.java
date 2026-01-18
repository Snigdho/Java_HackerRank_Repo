//https://www.hackerrank.com/challenges/java-list/problem

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();

        int n = scan.nextInt();
        while (n-- > 0) {
            arr.add(scan.nextInt());
        }

        int q = scan.nextInt();
        while (q-- > 0) {
            scan.nextLine(); // clear buffer
            String query = scan.nextLine();
            if (query.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                if (x == arr.size()) {
                    arr.add(y);
                } else {
                    arr.add(x, y);
                }
            }
            if (query.equals("Delete")) {
                int x = scan.nextInt();
                arr.remove(x);
            }
        }
        scan.close();

        System.out.println(
            arr.stream().map(String::valueOf).collect(Collectors.joining(" "))
        );
    }
}
