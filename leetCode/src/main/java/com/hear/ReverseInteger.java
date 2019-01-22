package com.hear;

/**
 * @description:
 * @author: WANGJR
 * @create: 2019-01-22 16:01
 **/
public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverseInteger(x));
    }

    public int reverseInteger(int x){
        int res = 0;
        boolean flag =false;
        if(x<0){
            flag = true;
            x*=-1;
        }
        StringBuilder s = new StringBuilder(String.valueOf(x));
        s.reverse();
        s.substring(s.lastIndexOf("0")>0?s.lastIndexOf("0"):0);
        try {
            res = Integer.valueOf(s.toString());
        }catch (NumberFormatException e){
            return 0;
        }
        if(flag){
            res*=-1;
        }
        return res;
    }
}
