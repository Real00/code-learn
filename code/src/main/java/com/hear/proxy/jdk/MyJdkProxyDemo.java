package com.hear.proxy.jdk;

import com.hear.proxy.Hello;
import com.hear.proxy.HelloImpl;

/**
 * @description: jdk动态代理模式写法
 * @author: WANGJR
 * @create: 2019-01-16 14:32
 **/
public class MyJdkProxyDemo {
    public static void main(String[] args) {
        Hello proxyHello = new MyInvocationHandler(new HelloImpl()).getProxy();
        proxyHello.sayHello();
    }

}
