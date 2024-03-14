package com.chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array01 {
    public static void main(String[] args) {
        Integer[] integers = {1, -1, 500, 15, 20};
        System.out.println(Arrays.toString(integers));//相当于遍历数组
        //进行排序
        //老韩解读
        //1. 可以直接使用冒泡排序 , 也可以直接使用 Arrays 提供的 sort 方法排序
        //2. 因为数组是引用类型，所以通过 sort 排序后，会直接影响到 实参 arr
        //3. sort 重载的，也可以通过传入一个接口 Comparator 实现定制排序
        //4. 调用 定制排序 时，传入两个参数 (1) 排序的数组 arr
        // (2) 实现了 Comparator 接口的匿名内部类 , 要求实现 compare 方法
        //5. 先演示效果，再解释
        //6. 这里体现了接口编程的方式 , 看看源码，就明白
        // 源码分析
        //(1) Arrays.sort(arr, new Comparator()
        //(2) 最终到 TimSort 类的 private static <T> void binarySort(T[] a, int lo, int hi, int start, // Comparator<? super T> c)()
        //(3) 执行到 binarySort 方法的代码, 会根据动态绑定机制 c.compare()执行我们传入匿名内部类的 compare ()
        // while (left < right) {
        // int mid = (left + right) >>> 1;
        // if (c.compare(pivot, a[mid]) < 0)
        // right = mid;
        // else
        // left = mid + 1;
        // }
        //(4) new Comparator() {
        // @Override
        // public int compare(Object o1, Object o2) {
        // Integer i1 = (Integer) o1;
        // Integer i2 = (Integer) o2;
        // return i2 - i1;
        // }
        // }
        //(5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
        // 会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
        // 将来的底层框架和源码的使用方式，会非常常见
        //Arrays.sort(arr); // 默认排序方法
        //定制排序
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(integers));
        //体现方法的重载，可以一定程度上客制化冒泡排序的需求


        int[] arr = {1, -1, 8, 0, 20};
        //bubble01(arr);
        bubble02(arr, new Comparator() //必须将比较器中的方法重写，因为这个是接口
        {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;// return i2 - i1;
            }
        }
        );
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 567);
        // binarySearch 通过二分搜索法进行查找，要求必须排好
        // 老韩解读
        //1. 使用 binarySearch 二叉查找
        //2. 要求该数组是有序的. 如果该数组是无序的，不能使用 binarySearch
        //3. 如果数组中不存在该元素，就返回 return -(low + 1); // key not found.
        System.out.println("index=" + index);



        //copyOf 数组元素的复制
        // 老韩解读
        //1. 从 arr 数组中，拷贝 arr.length 个元素到 newArr 数组中
        //2. 如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
        //3. 如果拷贝长度 < 0 就抛出异常 NegativeArraySizeException
        //4. 该方法的底层使用的是 System.arraycopy()
        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("==拷贝执行完毕后==");
        System.out.println(Arrays.toString(newArr));

        //ill 数组元素的填充
        Integer[] num = new Integer[]{9,3,2};
        //老韩解读
        //1. 使用 99 去填充 num 数组，可以理解成是替换原理的元素
        Arrays.fill(num, 99);
        System.out.println("==num 数组填充后==");
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组元素内容是否完全一致
        //老韩解读
        //1. 如果 arr 和 arr2 数组的元素一样，则方法 true;
        //2. 如果不是完全一样，就返回 false
        boolean equals = Arrays.equals(arr, newArr);
        System.out.println("equals=" + equals);

        //asList 将一组值，转换成 list
        //老韩解读
        //1. asList 方法，会将 (2,3,4,5,6,1)数据转成一个 List 集合
        //2. 返回的 asList 编译类型 List(接口)
        //3. asList 运行类型 java.util.Arrays#ArrayList, 是 Arrays 类的
        // 静态内部类 private static class ArrayList<E> extends AbstractList<E>
        // implements RandomAccess, java.io.Serializable
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList=" + asList);
        System.out.println("asList 的运行类型" + asList.getClass());


    }

    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
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
