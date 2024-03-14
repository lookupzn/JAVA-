package com.chapter13.date_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDate01 {
    public static void main(String[] args) {
        //第三代日期
        //老韩解读
        //1. 使用 now() 返回表示当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now(); //LocalDate.now();//LocalTime.now()
        System.out.println(ldt);
        //2. 使用 DateTimeFormatter 对象来进行格式化
        // 创建 DateTimeFormatter 对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期=" + format);
        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());
        LocalDate now = LocalDate.now(); //可以获取年月日

        LocalTime now2 = LocalTime.now();//获取到时分秒
        //提供 plus 和 minus 方法可以对当前时间进行加或者减
        //看看 890 天后，是什么时候 把 年月日-时分秒
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890 天后=" + dateTimeFormatter.format(localDateTime));
        //看看在 3456 分钟前是什么时候，把 年月日-时分秒输出
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456 分钟前 日期=" + dateTimeFormatter.format(localDateTime2));

        //时间戳
        //1.通过 静态方法 now() 获取表示当前时间戳的对象
        Instant now1 = Instant.now();
        System.out.println(now1);
        //2. 通过 from 可以把 Instant 转成 Date
        Date date = Date.from(now1);
        //3. 通过 date 的 toInstant() 可以把 date 转成 Instant 对象
        Instant instant = date.toInstant();
        System.out.println(now1);


    }
}
