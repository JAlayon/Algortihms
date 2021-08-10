package com.alayon.algorithms.problems.integers;

import java.util.Scanner;

public class PalindromeNumberLeetcode9 {

    public static void main(String[] args) {
        PalindromeNumberLeetcode9 problem = new PalindromeNumberLeetcode9();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(problem.isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x%10==0))
            return false;
        int reversedNumber = 0;
        while(x > reversedNumber){
            int pop = x%10;
            reversedNumber = reversedNumber * 10 + pop;
            x/=10;
        }
        return reversedNumber == x || reversedNumber/10 == x;
    }
}
