package com.hear;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @description:
 * @author: WANGJR
 * @create: 2018-12-29 00:47
 **/
public class TimeCode {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(LocalDate.parse("2018-11-02"));
    }
}
