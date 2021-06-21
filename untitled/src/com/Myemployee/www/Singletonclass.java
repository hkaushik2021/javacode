package com.Myemployee.www;

public class Singletonclass {


    private static Singletonclass obj = new Singletonclass();
    private Singletonclass(){ }

    public static Singletonclass getObj() {
        return obj;
    }
    public void myname (String name)
    {
        System.out.println(name);
    }


}
