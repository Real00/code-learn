package com.hear;

import java.util.*;

/**
 * @description:
 * @author: WANGJR
 * @create: 2019-01-03 20:27
 **/
public class StreamCode {

    public static void main(String[] args) {
        String s = "123 11 1 4 44 66 445 64 3 42";
        String[] arr = s.toString().split(" ");
        List<String> list = Arrays.asList(arr);
        Collections.sort(list,((o1, o2) -> Integer.parseInt(o1)-Integer.parseInt(o2)));
        list.forEach(i-> System.out.println(i));

    }
}
