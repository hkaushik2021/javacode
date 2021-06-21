package com.learning.www;

public  final  class myFinalClass{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public final void mymethod(){
        System.out.println("hello final method");
    }
    public String toString()
        {
        return Integer.toString(a);
    }

  public void sum(int i)
  {
      System.out.println("your sum is :"+ (i*i));
  }
}