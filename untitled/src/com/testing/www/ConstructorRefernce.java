package com.testing.www;

import sun.security.util.ArrayUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.sql.*;
interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
public class ConstructorRefernce {
    public static void main(String[] args) {

        System.out.println("*****************DB CONECTION END*************");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@LAPTOP-Q0I3UPQ9:1521:orcl", "scott", "oracle");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select EMPNO,SAL,ENAME from emp");

            singltonclass myemplist = singltonclass.getObj();
            System.out.println("object creation called");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                myemplist.myempdtls(rs.getString(3), rs.getInt(2), rs.getInt(1));
            }
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }



        System.out.println("*****************DB CONECTION END*************");
//        Dbconection orcldb = new Dbconection();
//        orcldb.mymethod();
        Messageable hello = Message::new;
        hello.getMessage("Hello");
        BiFunction<Integer,Integer,Integer> mysum=add::sum;
        int result=mysum.apply(3,4);
        System.out.println(result.);

        myinterface myintr = new ConstructorRefernce() ::saysomething;
        myintr.harish1(2,3);
//        List<String> mylist =  new ArrayList<String>();
        List<String> mylist = Arrays.asList("harish","baaaa","cccca");
        List<String> mycollectlst =mylist.stream().filter(i -> i.contains("a")).collect(Collectors.toList());
        mycollectlst.forEach(i -> System.out.println(i));
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        int Num = number.stream().filter(i->i%i==0).reduce((j,i)-> j*i).orElse(-1);
        List<String> mystring= Arrays.asList("How","Are","you");
        Optional<?> mystr = mystring.stream().reduce((i,j)->i+"-"+j.to);

        System.out.println(Num);
        System.out.println(mystr);
        if (mystr.isPresent()){
            System.out.println(mystr.get());
        }

        Innerclassexmpl.Myinner.msg();
        singltonclass emprecord = singltonclass.getObj();
        System.out.println("default sort with class");
        Collections.sort(emprecord.myemplist);
        emprecord.myemplist.stream().filter(x->x.getEmpid() > 7900).forEach(i-> System.out.println(i.getEmpname()));
        System.out.println(" sort with name");
        Collections.sort(emprecord.myemplist,new Sortbyname());
        emprecord.myemplist.stream().filter(x->x.getEmpid() > 7900).forEach(i-> System.out.println(i.getEmpname()));
        ConstructorRefernce objmainclass = new ConstructorRefernce();
        System.out.println(mylist.size());
        objmainclass.streamOf(mylist).filter(x->x.contains("v")).forEach(System.out::println);

    }




    public void sayaboutadd(int a,int b)
    {
        System.out.println("added called");
    }
    public void saysomething(String i){
        System.out.println("hello how r you");
    }
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty(): list.stream().filter(x->x=="harish") ;
    }

}

class add{
    public static int sum(int a,int b)
    {
        return a+b;
    }
}



