package com.Myemployee.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mycompany {

    public static void main (String Argg[]) {
        List<Employee> myemplst = new ArrayList<Employee>();
        myemplst.add(new Employee(10,"Harish",1500,2010));
        myemplst.add(new Employee(20,"Paras",1700,2011));
        myemplst.add(new Employee(30,"Shalu",1600,2008));
        Myruntimelist mylistobj = new Myruntimelist();
        List<?> mylistwithouttyp =mylistobj.mylst();
        System.out.println(mylistwithouttyp);


        myemplst.stream().forEach(i-> System.out.println(i.getEmpID()+"-"+i.getSalEmp() +"-"+ i.getYearOfJoining()+"-"+i.getNameEmp()));
        System.out.println("****************after sort by Year with default in POJO");
        Collections.sort(myemplst);
        myemplst.stream().forEach(i-> System.out.println(i.getEmpID()+"-"+i.getSalEmp() +"-"+ i.getYearOfJoining()+"-"+i.getNameEmp()));
        System.out.println("****************After sort Employee name with comparator");
        Collections.sort(myemplst,new Sortbyname());
        myemplst.stream().forEach(i-> System.out.println(i.getEmpID()+"-"+i.getSalEmp() +"-"+ i.getYearOfJoining()+"-"+i.getNameEmp()));
        System.out.println("****************After sort Employee sal with comparator");
        Collections.sort(myemplst,new Sortbysal());
        myemplst.stream().forEach(i-> System.out.println(i.getEmpID()+"-"+i.getSalEmp() +"-"+ i.getYearOfJoining()+"-"+i.getNameEmp()));

        List<Integer> lstempsal = myemplst.stream().map(x->x.getSalEmp()).collect(Collectors.toList());
        for (Integer integer : lstempsal) {
            System.out.println(integer);
        }

        System.out.println("****************Enum implementation");
        System.out.println(Employeetype.CONTRACT.getDescription()+"-"+Employeetype.PERMANENT.getTypeofemp());

        Arrays.stream(Employeetype.values()).forEach(x-> System.out.println(x.getDescription()));
        System.out.println("****************compile time memory allocation for Singleton class");
        Singletonclass myobj= Singletonclass.getObj();
        myobj.myname("harish");
        System.out.println("****************Run time memory allocation for Singleton class");
        Singletonclassruntime myrunobj =Singletonclassruntime.getObj();
        myrunobj.mycmpname("kumar");
        Singletonclassruntime myrunobj1 =Singletonclassruntime.getObj();
        myrunobj1.mycmpname("sharma");
    }
}
