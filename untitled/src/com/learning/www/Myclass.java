package com.learning.www;

import java.util.*;
import java.util.stream.Collectors;

public class Myclass {
    public static void main(String args[]) {
//        System.out.println("my comand line argu"+args[0]);
        final StringBuffer ab;
        ab = new StringBuffer("harish");
//        ab = new StringBuffer("shalu");
        System.out.println("called main");
        myFinalClass fnlcls = new myFinalClass();
        fnlcls.setA(10);
        System.out.println(fnlcls.getA());
        System.out.println(ab);
        System.out.println("fnlcls- " + fnlcls);

        Javatpoint j = new Javatpoint(20);
        System.out.println(j);
        callbyvalue callb = new callbyvalue();
        System.out.println("before" + callb.a);
        callb.updt(callb);
        System.out.println("After" + callb.a);
        HashMap<String, String> myhasmap = new HashMap<String, String>();
        myhasmap.put("hello", "how");
        System.out.println(myhasmap.size());
//        myhasmap.put(null, null);
        System.out.println(myhasmap.size());
//        myhasmap.put(null, null);
        System.out.println(myhasmap.get("null"));
        myhasmap.put("hello1", "how1");
        System.out.println(myhasmap.get("hello"));
        System.out.println("hasmap size"+myhasmap.size());
        Iterator myitr=myhasmap.keySet().iterator();
        while(myitr.hasNext())
        {
            String key = (String)myitr.next();
            System.out.println("my hash map itrator "+ key +" key is " + myhasmap.get(key));
        }

        HashSet<Integer> myhashset = new HashSet<Integer>();
        myhashset.add(1);
        myhashset.add(2);
        myhashset.add(null);
        System.out.println("myhashset" + myhashset.size());
        Iterator<Integer> itr = myhashset.iterator();
//        for (int i=0 ; i<=myhashset.size(),i++)
        while (itr.hasNext())
        {

//            itr =myhashset.iterator();
//            itr.remove();
            System.out.println("itr-" + itr.next());

        }
        myhashset.remove(1);
        itr=myhashset.iterator();
        while(itr.hasNext())
        {
            System.out.println("Itr-"+itr.next());
        }

        List<Integer> mysmrtlst = Arrays.asList(2,3,4,5,6,1,4,9,64,0);
        Collections.sort(mysmrtlst);
        System.out.println(mysmrtlst);
        mysmrtlst.forEach(i-> System.out.println("mysmrtlst"+i));
        mysmrtlst.stream().sorted(Comparator.reverseOrder()).forEach(fnlcls::sum);
        mysmrtlst.stream().filter(i -> i.equals(4)).forEach(fnlcls::sum);
        mysmrtlst.stream().map(i->i*i).forEach(fnlcls::sum);

        functionalInterface fi = (int a,int b) ->{
            System.out.println("my function");
        };
        fi.myFunMethod(2,4);
        fi.hello();
        Operation op=new Operation();
        op.myFunMethod(1,2);
//        fi.WhoRYou();

for(Integer i:myhashset)
{
    System.out.println(i);
}
        }



//
//        System.out.println("before change "+op.data);
//        op.change(500);
//        System.out.println("after change "+op.data);




    }

class hello extends finalmethod
{
    public void mymethod1()
    {
        System.out.println("overide");
    }

}

class callbyvalue{
    int a =10;
    void updt(callbyvalue b){
        b.a = b.a+100;
    }
}


class Operation implements functionalInterface {
    int data = 50;
    public void myFunMethod(int a,int b)
    {
        System.out.println("hello functionalInterface");
    }
    void change(int data) {
        data = data + 100;//changes will be in the local variable only
    }
}



