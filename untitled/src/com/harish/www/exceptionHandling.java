package com.harish.www;

import com.sun.org.apache.bcel.internal.generic.ATHROW;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;

public class exceptionHandling {
    public void test() throws RuntimeException
    {
        System.out.println("hello");

    }
}

 class mysubclas extends exceptionHandling {

     public void test() throws RuntimeException,ArithmeticException {
         System.out.println("testing");
         abscalling abscal = new abscalling();
         abscal.sum();
     }
 }
 class abscalling extends abstractclass
  {
      public void sum()
      {
          System.out.println("hello abstract");
      }
//      public void test()
//      {
//          abstractclass abs1 = new abscalling();
////          abscalling abs2 = new abscalling(3,5);
////          abs1.mul()
//      }

  }

  class recArea implements myinterface{
    public void area(int a,int b)
    {
        System.out.println("area"+(a*b));
    }
    @Override
    public void test()
    {
        System.out.println("helo imple");
    }
  }

