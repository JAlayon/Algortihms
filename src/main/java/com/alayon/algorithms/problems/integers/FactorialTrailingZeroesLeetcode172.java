package com.alayon.algorithms.problems.integers;

import java.util.Scanner;

public class FactorialTrailingZeroesLeetcode172 {

    public static void main(String[] args) {
        FactorialTrailingZeroesLeetcode172 problem = new FactorialTrailingZeroesLeetcode172();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(problem.trailingZeroes(5));

    }

    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
            n/=5;
            count += n;
        }
        return count;
    }
}
