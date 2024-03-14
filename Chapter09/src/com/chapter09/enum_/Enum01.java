package com.chapter09.enum_;
//要求创建季节(Season) 对象，请设计并完成。以下是季节特点
//1) 季节的值是有限的几个值(spring, summer, autumn, winter)
//2) 只读，不需要修改
//解决方案 枚举(enumeration) -- 一组常量的集合
//理解：枚举属于一种特殊的类，里面只包含一组有限的特定的对象
//如何实现：1) 自定义类实现枚举
//2) 使用 enum 关键字实现枚举




public class Enum01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Der.SPRING);

        Der autumn = Der.SPRING;
        Der[] values = Der.values();
        System.out.println("===遍历取出枚举对象(增强 for)====");
        for (Der der : values) {//增强 for 循环
            System.out.println(der);
        }
        Der autumn1 = Der.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);
    }

    //自定义类实现枚举
    static class Season {
        private String name;
        private String weather;

        private Season(String name, String weather) {
            this.name = name;
            this.weather = weather;
        }//构造器私有化，防止对象被调用导致属性被修改

        public String getName() {
            return name;
        }

        public String getWeather() {
            return weather;
        }

        //去掉setter，防止属性被修改
        public static final Season SPRING = new Season("春天", "温暖");
        public static final Season WINTER = new Season("冬天", "寒冷");
        public static final Season AUTUMN = new Season("秋天", "凉爽");
        public static final Season SUMMER = new Season("夏天", "炎热");

        //在 Season 内部，直接创建固定的对象，然后优化，可以加入 final 修饰锁定变量


        @Override
        public String toString() {
            return "Season{" +
                    "name='" + name + '\'' +
                    ", weather='" + weather + '\'' +
                    '}';
        }
    }

    //关键词enum实现枚举
    enum Der {
        //常量名(实参列表)
        SPRING("春天", "温暖"), WINTER("冬天", "寒冷"),
        AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热")/*,What()*/;
        private String name;
        private String desc;

        private Der() {
        }

        private Der(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getName() {

            return name;
        }

        public String getDesc() {
            return desc;
        }

        @Override
        public String toString() {
            String s;
            s = "Der{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    '}';
            return s;
        }

        //SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热")/*,What()*/;
        //如果使用 enum 来实现枚举，要求将定义常量对象，写在前面
    }
}
