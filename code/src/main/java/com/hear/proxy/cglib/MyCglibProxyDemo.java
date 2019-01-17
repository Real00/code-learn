package com.hear.proxy.cglib;

import com.hear.proxy.HelloImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * @description:
 * @author: WANGJR
 * @create: 2019-01-16 15:26
 **/
public class MyCglibProxyDemo {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloImpl.class);
        enhancer.setCallback(new MyInvocationHandler());
        HelloImpl hello = (HelloImpl)enhancer.create();
        hello.sayHello();
    }
}
