package com.chapter09.innerClass_;

public class AICanswer {

    public static void main(String[] args) {

        CelPhone cellPhone = new CelPhone();

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

class CelPhone {//类

    public void alarmClock(Bell bell) {//形参是 Bell 接口类型
        System.out.println(bell.getClass());
        bell.ring();//动态绑定
    }
}
