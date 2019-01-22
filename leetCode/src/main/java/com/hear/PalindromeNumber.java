package com.hear;

/**
 * @description: 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 * @author: WANGJR
 * @create: 2019-01-22 16:41
 **/
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.palindromeNumber(x));
    }

    public boolean palindromeNumber(int x) {
        if (x < 0) {
            return false;
        }
        String reversString = "";
        StringBuilder s = new StringBuilder(String.valueOf(x));
        reversString = s.reverse().toString();
        return reversString.equals(String.valueOf(x));
    }

}