// https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.*;

public class Solution {

    private static boolean haswon;
    private static int gameSize;
    private static int leap;

    public static boolean canWin(int leapValue, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        haswon = false;
        gameSize = game.length;
        leap = leapValue;
        boolean[] alreadyVisited = new boolean[gameSize]; // all are initialized to false by default

        return dfsCanWin(game, alreadyVisited, 0);
    }

    public static boolean dfsCanWin(
        int[] game,
        boolean[] alreadyVisited,
        int currentIndex
    ) {
        if (
            currentIndex < 0 ||
            alreadyVisited[currentIndex] ||
            game[currentIndex] != 0
        ) return false;
        alreadyVisited[currentIndex] = true;

        if (
            (currentIndex + 1) >= gameSize || (currentIndex + leap) >= gameSize
        ) haswon = true;

        if (haswon) return true;
        if (
            dfsCanWin(game, alreadyVisited, currentIndex + leap) ||
            dfsCanWin(game, alreadyVisited, currentIndex + 1) ||
            dfsCanWin(game, alreadyVisited, currentIndex - 1)
        ) return true;

        return haswon ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
