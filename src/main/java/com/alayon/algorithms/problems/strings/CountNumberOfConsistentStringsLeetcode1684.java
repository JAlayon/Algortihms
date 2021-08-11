package com.alayon.algorithms.problems.strings;

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 *
 * Example 1:
 *
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 *
 *
 * Example 2:
 *
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 */
public class CountNumberOfConsistentStringsLeetcode1684 {

    public int countConsistentStrings(String allowed, String[] words) {
        int consistent = 0;
        for(String word: words){
            char letters[] = word.toCharArray();
            boolean isConsistent = true;
            for(char c: letters){
                if(allowed.indexOf(c) == -1){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent)
                consistent++;
        }
        return consistent;
    }
}
