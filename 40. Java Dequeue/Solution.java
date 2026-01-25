// https://www.hackerrank.com/challenges/java-dequeue/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxUniqueElements = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
            if (deque.size() == m) {
                // also works with: new HashSet<>(deque).size()
                // but this is more optimized.
                int tempUniqueElementsCount = freqMap.size();
                if (
                    tempUniqueElementsCount > maxUniqueElements
                ) maxUniqueElements = tempUniqueElementsCount;

                int removed = deque.removeFirst();
                if (freqMap.get(removed) == 1) {
                    freqMap.remove(removed);
                } else {
                    freqMap.put(removed, freqMap.get(removed) - 1);
                }
            }
        }
        in.close();
        System.out.println(maxUniqueElements);
    }
}
