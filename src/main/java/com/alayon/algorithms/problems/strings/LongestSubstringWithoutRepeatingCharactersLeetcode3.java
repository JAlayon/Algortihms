package com.alayon.algorithms.problems.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharactersLeetcode3 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            String sub = s.substring(i,i+1);
            int x = 1;
            for(int j = i+1; j < s.length(); j++){
                if(sub.indexOf(s.charAt(j)) == -1){
                    sub = s.substring(i,j+1);
                    x++;
                }else{
                    break;
                }
            }
            max = Math.max(max,x);
        }
        return max;
    }

    public static int lengthOfLongestSubString22(String s){
        int max = 0;
        Map<String,Integer> map = new HashMap<>();
        int i=0,j=0;
        while(i < j && j < s.length()) {
            String currentChar = String.valueOf(s.charAt(j));
            if (map.containsKey(currentChar)) {
                i = Math.max(i,map.get(currentChar));
            }
            map.put(currentChar,j+1);
            int length = j-i + 1;
            max = Math.max(max,length);
            j++;
        }
        return max;
    }
}
