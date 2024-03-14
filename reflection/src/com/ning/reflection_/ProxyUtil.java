package com.ning.reflection_;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {//给明星传进来创建代理

    public static StartInterface creatProxy(BigStar bigStar) {
        StartInterface star = (StartInterface) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{StartInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if("sing".equals(method.getName()))
                {
                    System.out.println("准备话同，收money");
                }
                else if("dance".equals(method.getName()))
                {
                    System.out.println("准备地方，收money");
                }
                return method.invoke(bigStar,args);
            }
        });
        return star;

    }

}
