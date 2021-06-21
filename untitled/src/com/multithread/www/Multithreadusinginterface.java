package com.multithread.www;

public class Multithreadusinginterface implements Runnable{
    public void run()
    {
        System.out.println("interface thread call -" + Thread.currentThread().getName());

    }
}
