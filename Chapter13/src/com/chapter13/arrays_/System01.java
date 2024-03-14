package com.chapter13.arrays_;

import java.util.Arrays;

public class System01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr01 = new int[3];
        System.arraycopy(arr,0,arr01,0,3);
        System.out.println(Arrays.toString(arr01));
        // 一般使用 Arrays.copyOf 完成复制数
        System.gc();

        //currentTimeMillis:返回当前时间距离 1970-1-1 的毫秒数
        // 老韩解读:
        System.out.println(System.currentTimeMillis());
    }
}
