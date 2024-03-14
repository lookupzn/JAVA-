package com.chapter09.designPattern.single_;

//懒汉式
public class Single02 {

    public static void main(String[] args) {

        Cat instance = Cat.getInstance();
        System.out.println(instance);
        //再次調用 getInstance
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);//T

    }
}

class Cat {
    private String name;

    //1.构造器私有化
    private Cat(String name) {
        this.name = name;
    }

    //2. 定义一个static对象
    private static Cat cat; //默認是 null，如果程序员不去创建一个对象实例，则不会占据空间

    //3. 提供public的静态方法，返回cat对象实例
    public static Cat getInstance() {
        if (cat == null) {//如果還沒有創建 cat 對象
            cat = new Cat("小可愛");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    //4.懶漢式的原因：只有當用戶使用 getInstance 時，才返回 cat 對象, 後面再次調用時，會返回上次創建的 cat 對
}

