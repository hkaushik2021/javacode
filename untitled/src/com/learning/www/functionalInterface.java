package com.learning.www;
@FunctionalInterface
public interface functionalInterface {
    abstract void myFunMethod( int a,int b);
    public default void hello(){
        System.out.println("hello");
    }
    public static void WhoRYou(){
        System.out.println("i am java");
    };
}
