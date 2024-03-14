package com.chapter13.homework_;

import java.util.Arrays;
import java.util.Comparator;

public class H01 {
    public static void main(String[] args) {
        //需求：将字符串的部分字符顺序反转
        //如：abcdef --> aedcbf
        //编写方法public static String reserve(String str,int start,int end)搞定
        String str = "abcdef";
        System.out.println(reserve(str,2,6));

    }

    public static String reserve(String str,int start,int end)
    {
        char[] charArray = str.toCharArray();
        char[] newArr = new char[end - start + 1];
        System.arraycopy(charArray,start-1,newArr,0,end - start + 1);
        bubble02(newArr, new Comparator() //必须将比较器中的方法重写，因为这个是接口
                {
                    @Override
                    public int compare(Object o1, Object o2) {
                        char i1 = (Character) o1;
                        char i2 = (Character) o2;
                        return i2 - i1;// return i2 - i1;
                    }
                }
        );
        char[] new01 = new char[charArray.length];
        String newStr = "";
            for(int i = 0; i < start - 1;i++)
            {
                new01[i] = charArray[i];
            }
            System.arraycopy(newArr,0,new01,start - 1,newArr.length);
            for(int i = end; i < new01.length;i++)
            {
                new01[i] = charArray[i];
            }
        for(int i = 0 ; i < new01.length;i++)
        {
            newStr += new01[i];
        }





        return newStr;
    }

    public static void bubble02(char[] arr, Comparator c) {
        char temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组排序由 c.compare(arr[j], arr[j + 1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
