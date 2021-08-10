package com.alayon.algorithms.problems.integers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzLeetCode412 {

    public static void main(String[] args) {
        FizzBuzzLeetCode412 problem = new FizzBuzzLeetCode412();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(problem.fizzBuzz(n).toString());
    }

    public List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>(n);
        for(int i = 1; i <= n; i++){
            if(i % 5 == 0 && i % 3 == 0)
                result.add("FizzBuzz");
            else if(i % 5 == 0)
                result.add("Buzz");
            else if(i % 3 == 0)
                result.add("Fizz");
            else
                result.add(Integer.toString(i));
        }
        return result;
    }
}
