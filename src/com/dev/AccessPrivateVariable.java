package com.dev;

import java.lang.reflect.Field;

class B{
    private int x=10;
}
public class AccessPrivateVariable {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f = B.class.getDeclaredField("x");
        f.setAccessible(true);
        int a = (int) f.get(new B());
        System.out.println(a);
    }
}
