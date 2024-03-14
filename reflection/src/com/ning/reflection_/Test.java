package com.ning.reflection_;

public class Test {
    public static void main(String[] args) {
        BigStar caixukun = new BigStar("caixukun");
        StartInterface proxy = ProxyUtil.creatProxy(caixukun);

        String result = proxy.sing("只因你太美");
        System.out.println(result);

    }
}
