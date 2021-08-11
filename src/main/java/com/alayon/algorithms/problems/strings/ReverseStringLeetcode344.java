package com.alayon.algorithms.problems.strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class ReverseStringLeetcode344 {
    
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
