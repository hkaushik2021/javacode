package com.testing.www;

import java.util.LinkedList;
import java.util.List;

public class singltonclass {

    public List<Employeedetail> myemplist = new LinkedList<Employeedetail>();

    private static singltonclass obj = new singltonclass();
    private singltonclass(){ }

    public static singltonclass getObj() {
        return obj;
    }
    public void myname (String name)
    {
        System.out.println(name);
    }

    public void myempdtls(String empname, int empsal, int empid)
    {
        myemplist.add(new Employeedetail(empname, empsal, empid));
        System.out.println("size-"+myemplist.size());
    }

}