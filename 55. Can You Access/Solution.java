// https://www.hackerrank.com/challenges/can-you-access/problem

import java.io.*;

// import java.security.*; // no longer relevant in java 18+

public class Solution {

    public static void main(String[] args) throws Exception {
        // DoNotTerminate.forbidExit();
        // the previous line is commented because it is no longer relevant in java 18+

        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );
            int num = Integer.parseInt(br.readLine().trim());
            Object o; // Must be used to hold the reference of the instance of the class Solution.Inner.Private

            //Write your code here
            Solution.Inner inner = new Solution.Inner();
            Solution.Inner.Private innerPrivate = inner.new Private();
            o = innerPrivate;
            System.out.println(num + " is " + innerPrivate.powerof2(num));
            System.out.println(
                "An instance of class: " +
                    o.getClass().getCanonicalName() +
                    " has been created"
            );

            //} catch (DoNotTerminate.ExitTrappedException e) {
            // simplifying the existing code
        } catch (Exception e) {
            //end of try

            System.out.println("Unsuccessful Termination!!");
        }
    } //end of main

    static class Inner {

        private class Private {

            private String powerof2(int num) {
                return ((num & (num - 1)) == 0)
                    ? "power of 2"
                    : "not a power of 2";
            }
        }
    } //end of Inner
} //end of Solution

// the following code is no longer available in java 18+
/*
class DoNotTerminate {

    //This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
*/
