package com.chapter10.exception_.homework;

import sun.awt.geom.AreaOp;

public class H01 {
    public static void main(String[] args) {
        cal a = new cal();
        try {a.chu(15,0);}
        catch(NumberFormatException e)
        {
          System.out.println("数据格式异常");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("数组下标溢出异常");
        }
        catch (ArithmeticException e)
        {
            System.out.println("计算异常");
        }
    }

}

class cal {
    public int chu(int a,int b)
    {
        return a / b;
    }
}

