package com.harish.www;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        int a;
        int b=10;
        ArrayListLinkList arlst= new ArrayListLinkList();
        arlst.lst();
        recArea area = new recArea();
        area.area(2,3);
        area.test();
      
        exceptionHandling myclass = new mysubclas();
        try
        {
            myclass.test();
        }
        catch (Exception e )
        {
            System.out.println("exception");
        }
    System.out.println("enter your number");
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();
    switch(a)
    {
        case 4:
            System.out.println("hello");
            break;
        case 5:
            System.out.println("hello");
//            continue;
        default :
            System.out.println("not correct");
    }

    for (int i=0; i<=a;i++)
        {
            System.out.println("no-"+i);
        }
    String fname [] ={"harish","Shalu"};
    String name [][] ={{"harish","Shalu"},{"kumar","sharma"}};
        System.out.println(name[1][1]);
        try {
//            System.out.println(name[13][1]);
            for (String i : fname) {
                System.out.printf(i);
//                System.out.print(i);
//                System.out.println(i);
            }
            do {
                System.out.println("called do");
                ++a;
            }
            while ( a<=10);

        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            System.out.println("stack");
            System.out.println(e.fillInStackTrace());
        }

        System.out.println(fname[1].charAt(3));
        System.out.println(fname[1].toLowerCase());
        double e;
        e = (double)a;
        System.out.println(e);

        int c=mysum (a,b);
        System.out.println(c);
        float flt=mysum ((float)a,(float)b);
        System.out.println(flt);
//        int result = sum(10);
//        System.out.println(result);
    }

    static int mysum (int x,int y)
    {   int a=20;
        System.out.println("inside int");
        return(x+y);

    }

    static float mysum (float x,float y)
    {
        System.out.println("inside float");
        return(x+y);

    }

    static int sum (int inp)
    {
        if (inp > 0)
        {    System.out.println("if"+inp + sum (inp-1));
            return inp + sum (inp-1);

        }
        else
        {   System.out.println("ELSE"+inp );
            return inp;
        }
    }


}

