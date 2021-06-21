package com.Myemployee.www;


public class Singletonclassruntime {


    private static Singletonclassruntime obj ;
    private Singletonclassruntime(){ }

    public static Singletonclassruntime getObj() {
        if (obj == null){
            obj = new Singletonclassruntime();
            System.out.println("instance initiated");
        }
        return obj;
    }
    public void myname (String name)
    {
        System.out.println(name);
    }
    public void mycmpname (String name)
    {
        System.out.println(name);
    }

}
