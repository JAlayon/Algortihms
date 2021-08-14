package com.alayon.algorithms.problems.strings;

public class ReverseWordsInAStringLeetcode151 {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int i = s.length() - 1;
        int j;
        while(i >= 0){
            if(s.charAt(i) == ' ')
                i--;
            else{
                j=i;
                while(i >= 0 && s.charAt(i) != ' ')
                    i--;
                sb.append(s.substring(i+1,j+1)).append(" ");
            }
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }
}
