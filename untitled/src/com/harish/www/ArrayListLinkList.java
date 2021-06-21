package com.harish.www;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkList {

    public void lst() {
        List<Integer> arrlst = new ArrayList<Integer>();
        List<Integer> lnklst = new LinkedList<Integer>();
        long strtim;
        long endtm;
        strtim = System.currentTimeMillis();
        System.out.println(strtim);
        for (int i = 0; i <= 100000; i++) {
            arrlst.add(i);
            arrlst.remove(0);
        }
        endtm = System.currentTimeMillis();
        System.out.println("diffarray" + (endtm - strtim));


        strtim = System.currentTimeMillis();
        System.out.println(strtim);
        for (int i = 0; i <= 100000; i++) {
            lnklst.add(i);
//            lnklst.removeLast();
        }
        endtm = System.currentTimeMillis();
        System.out.println("difflnklit" + (endtm - strtim));
    }


    public void hello()

    {
        List<String> al = new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2 = new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: " + al);
        System.out.println("linkedlist: " + al2);
    }


}

