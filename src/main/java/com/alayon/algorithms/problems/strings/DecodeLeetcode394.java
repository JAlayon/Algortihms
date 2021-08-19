package com.alayon.algorithms.problems.strings;

import java.util.Stack;

/**
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square
 * brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * Example 1:
 *
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 *
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 *
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 * Example 4:
 *
 * Input: s = "abc3[cd]xyz"
 * Output: "abccdcdcdxyz"
 */
public class DecodeLeetcode394 {

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }

    public static String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> strs = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        StringBuilder temp;
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            temp = new StringBuilder("");
            if(Character.isDigit(currentChar)){
                int num = currentChar - '0';
                while(i+1 < s.length() && Character.isDigit(s.charAt(i+1))){
                    num = num*10 + s.charAt(i+1) - '0';
                    i++;
                }
                numbers.add(num);
            }
            else if(s.charAt(i) == '['){
                strs.push(sb.toString());
                sb = new StringBuilder("");
            }
            else if (Character.isAlphabetic(s.charAt(i))){
                sb.append(Character.toString(currentChar));
            }
            else if (s.charAt(i) == ']'){
                temp.append(strs.pop());
                int toRepeat = numbers.pop();
                for(int j = 0; j < toRepeat; j++){
                    temp.append(sb.toString());
                }
                sb = new StringBuilder();
                sb.append(temp.toString());
            }
        }
        return sb.toString();
    }
}
