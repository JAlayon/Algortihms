package com.alayon.algorithms.problems.strings;

/**
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 */
public class LongestPalindromicSubstringLeetcode5 {

    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return "";

        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++){
            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s,i,i+1);
            int max = Math.max(len1,len2);
            if (max > end - start){
                start = i - ((max-1)/2);
                end = i + max/2;
            }
        }
        return s.substring(start, end+1);
    }

    private int expandFromMiddle(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
