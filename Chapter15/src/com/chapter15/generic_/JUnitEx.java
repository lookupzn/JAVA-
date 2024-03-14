package com.chapter15.generic_;

import org.junit.jupiter.api.Test;

public class JUnitEx {
    public static void main(String[] args) {

    }

    User wang = new User(1,"Wang",15);
    User zhang = new User(1,"Zhang",17);
    User song = new User(2,"Song",19);
    DAO<User> tester = new DAO();
    @Test
    public void testSave()
    {
        tester.save("1",wang);
    }
    @Test
    public void testGet()
    {
        tester.save("1",wang);
        tester.get("1");
    }
    @Test
    public void testUpdate()
    {
        tester.save("1",wang);
        tester.update("1",zhang);
    }
    @Test
    public void testListT()
    {
        tester.save("1",wang);
        System.out.println(tester.list());
    }
    @Test
    public void testDelete()
    {
        tester.save("1",wang);
        tester.save("2",song);
        System.out.println(tester.list());
        tester.delete("1");
        System.out.println(tester.list());
    }

}
