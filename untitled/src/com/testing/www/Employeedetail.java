package com.testing.www;

import java.util.Comparator;

public class Employeedetail implements Comparable<Employeedetail>{


    private String empname;
    private int empsal;
    private int empid;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpsal() {
        return empsal;
    }

    public void setEmpsal(int empsal) {
        this.empsal = empsal;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Employeedetail(String empname, int empsal, int empid) {
        this.empname = empname;
        this.empsal = empsal;
        this.empid = empid;
    }

    public int compareTo(Employeedetail obj){
        return this.empsal - obj.empsal;

    }

}

class Sortbyname implements Comparator<Employeedetail> {
    public int compare(Employeedetail obj1,Employeedetail obj2)
    {
        return obj1.getEmpname().compareTo(obj2.getEmpname());
    }
}
