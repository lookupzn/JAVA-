package com.chapter09.innerClass_;

public class AICpractice {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock();
        System.out.println("=====================");

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("猪猪起床！");
            }
        });

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("猪猪上课！");
            }
        });

    }
}

class CellPhone {
    //闹钟功能
    public void alarmClock() {
        Bell bell = new Bell() {
            @Override
            public void ring() {
                System.out.println("猪猪起床！");
            }
        };

        bell.ring();

        Bell bell01 = new Bell() {
            @Override
            public void ring() {
                System.out.println("猪猪上课！");
            }
        };

        bell01.ring();
    }

    public void alarmClock(Bell bell) {//形参是 Bell 接口类型

        bell.ring();//动态绑定
    }


}


