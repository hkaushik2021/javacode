package com.multithread.www;

public class Multithreading extends  Thread {
    public void run()
    {
        System.out.println("hello thread- " + Thread.currentThread().getName());
    }
    public static void main(String Agg[])
    {
        Multithreading mythreadobj = new Multithreading();
        mythreadobj.start();
//        Multithreadusinginterface multithrdobj =new Multithreadusinginterface();
        Thread thrd = new Thread(new Multithreadusinginterface());
        for (int i=0;i<=5;i++)
        {
            Thread thrd1 = new Thread(new Multithreadusinginterface());
            thrd1.start();
        }

//        thrd.setPriority(
//        );
//        thrd.start();
//
//        thrd.run();
//        thrd1.run();
        thrd.setName("mythread");
        System.out.println(thrd.getName());

    }
}


