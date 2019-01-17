package com.hear;

import java.util.*;

/**
 * @description: lumbuda表达式练习
 * @author: WANGJR
 * @create: 2018-12-28 21:38
 **/
public class LambdaCode {
    public static void main(String[] args) {
        example4();
    }

    private static void example1() {
        String[] oldWay = "Improving code with LambdaCode expressions in Java 8".split(" ");
        Arrays.sort(oldWay, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        System.out.println(String.join(", ", oldWay));
    }

    private static void example2() {
        String[] oldWay = "Improving code with LambdaCode expressions in Java 8".split(" ");
        Arrays.sort(oldWay, (s1, s2) -> {
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        });
        System.out.println(String.join(", ", oldWay));
    }

    private static void example3() {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": New LambdaCode Runnable");
        }).start();
    }

    private final static Map<String, String> someMap = new HashMap<String, String>() {
        {
            put("redis", "127.0.0.1");
            put("solr", "127.0.0.1");
        }
    };

    private final static List<String> someList = new ArrayList<String>() {
        {
            add("s1");
            add("s2");
            add("s3");
            add("s4");
        }
    };

    private static void example4() {
        someMap.forEach((s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        });
    }

}
