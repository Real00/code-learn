package com.hear;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @author: WANGJR
 * @create: 2019-01-04 14:12
 **/
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s){
        if(s==null||s.length()==0){return 0;}
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        for(int i =0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            res = Math.max(res,i-j+1);
        }
        return res;
    }


    /** 
    * @Description: 有bug,待修复 
    * @Author: WANGJR 
    */ 
    public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int res = 0;
        for(int i=0,j=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j++));
            }
            set.add(s.charAt(i));
            res = Math.max(res,set.size());
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "qrsvbspk";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
