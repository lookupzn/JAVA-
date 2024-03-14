package com.chapter13.string_;

public class StringBuffer01 {
    public static void main(String[] args) {
        //1. StringBuffer 的直接父类 是 AbstractStringBuilder
        //2. StringBuffer 实现了 Serializable, 即 StringBuffer 的对象可以串行化
        //3. 在父类中 AbstractStringBuilder 有属性 char[] value,不是 final
        // 该 value 数组存放 字符串内容，引出存放在堆中的
        //4. StringBuffer 是一个 final 类，不能被继承
        //5. 因为 StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)
        // 不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer);

        //看 String——>StringBuffer
        String str = "hello tom";
        //方式 1 使用构造器
        //注意： 返回的才是 StringBuffer 对象，对 str 本身没有影响
        StringBuffer stringBuffer01 = new StringBuffer(str);
        //方式 2 使用的是 append 方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        //看看 StringBuffer ->String
        StringBuffer stringBuffer3 = new StringBuffer("韩顺平教育");
        //方式 1 使用 StringBuffer 提供的 toString 方法
        String ss = stringBuffer3.toString();
        //方式 2: 使用构造器来搞定
        String s1 = new String(stringBuffer3);


        StringBuffer s = new StringBuffer("hello");//create
        s.append(',');// "hello,"
        s.append("张三丰");//"hello,张三丰"
        s.append("赵敏").append(100).append(true).append(10.5);//"hello,张三丰赵敏100true10.5" System.out.println(s);//"hello,张三丰赵敏100true10.5"

        //delete
        s.delete(11, 14);
        System.out.println(s);//"hello,张三丰赵敏true10.5"

        //改
        //老韩解读，使用 周芷若 替换 索引 9-11 的字符 [9,11)
        s.replace(9, 11, "周芷若");
        System.out.println(s);//"hello,张三丰周芷若true10.5"
        //查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);

        //insert
        s.insert(9, "赵敏");
        System.out.println(s);//"hello,张三丰赵敏周芷若true10.5"
        System.out.println(s.length());//22
        System.out.println(s);



            String str4 = null;// ok
            StringBuffer sb = new StringBuffer(); //ok
            sb.append(str4);//需要看源码 , 底层调用的是 AbstractStringBuilder 的 appendNull（）
            System.out.println(sb.length());//4, appendNull（）
            System.out.println(sb);

            //下面的构造器，会抛出 NullpointerException
            StringBuffer sb111 = new StringBuffer(str4);//看底层源码 super(str.length() + 16);
            System.out.println(sb111);
            //回去看一下视频


    }
}
