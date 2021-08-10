package com.alayon.algorithms.problems.integers;

public class FactorialTrailingZeroesLeetcode172 {

    public static void main(String[] args) {

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
