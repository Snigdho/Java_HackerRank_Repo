// https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;

public class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        char[] parentheseses = { '(', ')', '[', ']', '{', '}' };

        ParenthesesSet p1 = new ParenthesesSet('(', ')');
        ParenthesesSet p2 = new ParenthesesSet('[', ']');
        ParenthesesSet p3 = new ParenthesesSet('{', '}');

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            Stack<Character> pTrackerStack = new Stack<>();
            boolean balanced = true;
            for (char ch : input.toCharArray()) {
                int pIndex = Arrays.binarySearch(parentheseses, ch);
                if (pIndex >= 0) {
                    if (pIndex < 2) {
                        if (ch == p1.getStarting()) {
                            pTrackerStack.push(ch);
                        } else if (
                            pTrackerStack.size() != 0 &&
                            pTrackerStack.peek() == p1.getStarting() &&
                            ch == p1.getclosing()
                        ) {
                            pTrackerStack.pop();
                        } else {
                            balanced = false;
                            break;
                        }
                    } else if (pIndex < 4) {
                        if (ch == p2.getStarting()) {
                            pTrackerStack.push(ch);
                        } else if (
                            pTrackerStack.size() != 0 &&
                            pTrackerStack.peek() == p2.getStarting() &&
                            ch == p2.getclosing()
                        ) {
                            pTrackerStack.pop();
                        } else {
                            balanced = false;
                            break;
                        }
                    } else {
                        if (ch == p3.getStarting()) {
                            pTrackerStack.push(ch);
                        } else if (
                            pTrackerStack.size() != 0 &&
                            pTrackerStack.peek() == p3.getStarting() &&
                            ch == p3.getclosing()
                        ) {
                            pTrackerStack.pop();
                        } else {
                            balanced = false;
                            break;
                        }
                    }
                }
            }
            System.out.println(
                !balanced || pTrackerStack.size() != 0 ? "false" : "true"
            );
        }
        sc.close();
    }
}

class ParenthesesSet {

    char starting;
    char closing;

    public ParenthesesSet(char a, char b) {
        this.starting = a;
        this.closing = b;
    }

    public char getStarting() {
        return this.starting;
    }

    public char getclosing() {
        return this.closing;
    }
}
