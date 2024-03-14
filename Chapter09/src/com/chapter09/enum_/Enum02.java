package com.chapter09.enum_;

public class Enum02 {
    //声明 Week 枚举类，其中包含星期一至星期日的定义； MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,SUNDAY
    //使用 values 返回所有的枚举数组, 并遍历
    public static void main(String[] args) {
        Week[] values = Week.values();
        System.out.println("======遍历取出枚举对象======");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("===遍历取出枚举对象(增强 for)====");
        for (Week week : values) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("周一", 1), TUESDAY("周二", 2), WEDNESDAY("周三", 3),
    THURSDAY("周四", 4), FRIDAY("周五", 5), SATURDAY("周六", 6), SUNDAY("周日", 7);
    private String name;
    private int index;

    Week(String name, int index) {
        this.name = name;
        this.index = index;
    }

    Week() {
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
