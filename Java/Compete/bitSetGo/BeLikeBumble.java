/*
  Question linke : https://www.hackerrank.com/contests/iiitv-bitsetgo-18/challenges/be-like-bumble/problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int c, max = 0;
        long n = 0;

        for (int i = 0; i < t; i++) {
            c = sc.nextInt();
            n = sc.nextLong();
            BigInteger result = BigInteger.valueOf(c*n*n*n).mod(BigInteger.valueOf(1000000007));
            System.out.println(result);
        }
    }
    
    
    
}
