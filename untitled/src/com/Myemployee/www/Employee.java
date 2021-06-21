package com.Myemployee.www;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private int empID;
    private String nameEmp;
    private int salEmp;
    private int yearOfJoining;

    public int compareTo(Employee e){
        return this.yearOfJoining- e.yearOfJoining;
    }

    Employee(int iEMPid,String iEname,int iSalemp ,int iyearOfJoining){
        this.empID=iEMPid;
        this.nameEmp=iEname;
        this.salEmp=iSalemp;
        this.yearOfJoining =iyearOfJoining;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public int getSalEmp() {
        return salEmp;
    }

    public void setSalEmp(int salEmp) {
        this.salEmp = salEmp;
    }
    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }



}

class Sortbyname implements Comparator<Employee>
{
   public int compare(Employee o1, Employee o2)
    {
        return o1.getNameEmp().compareTo(o2.getNameEmp());
    }

}
class Sortbysal implements Comparator<Employee>
{
    public int compare (Employee o1,Employee o2)
    {
        return o1.getSalEmp()- o2.getSalEmp();
    }
}

class Myruntimelist{

    public List<Integer> mylst()
    {   List<Integer> myreturnlst = new ArrayList<Integer>();
        myreturnlst.add(1);
        myreturnlst.add(2);
        return myreturnlst;
    }
}