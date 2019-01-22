package com.hear;

/**
 * @description:
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @author: WANGJR
 * @create: 2019-01-22 15:24
 **/
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "cbbd";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome(s));
    }

    public String longestPalindrome(String s){
        if(s == null || s.length() ==0){ return s;}
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        for(int j =0;j<s.length();j++){
            for(int i = 0;i<=j;i++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j-i<=2)||(dp[i+1][j-1]));
                if(dp[i][j]){
                    if(j-i+1>max){
                        max=j-i+1;
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}
