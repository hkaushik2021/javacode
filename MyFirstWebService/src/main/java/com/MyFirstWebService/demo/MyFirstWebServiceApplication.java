package com.MyFirstWebService.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.MyFirstWebService.demo.doa.EmployeRepository;
import com.MyFirstWebService.demo.entities.Emp;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class MyFirstWebServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(MyFirstWebServiceApplication.class, args);
//		@Autowired	
		EmployeRepository employerepository = context.getBean(EmployeRepository.class);
		Optional<Emp> mylist = employerepository.findById(7369);
		long myempcount = employerepository.count();
		List<Emp> mynamelist =   employerepository.findByEname("JONES");
		List<Emp> mysallist =   employerepository.findBySal(1250);
		if (mylist.isPresent())
		{
			mylist.stream().forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		}
		
		mynamelist.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		mysallist.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		System.out.println("myempcount"+myempcount);
		
		List<Emp> myempdtl = employerepository.findByEnameAndSal("ALLEN", 1600);
		myempdtl.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		
		List<Emp> myempdt2 = employerepository.findByEnameStartingWith("M");
		myempdt2.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		
		System.out.println("All employee details");
		List<Emp> myempdt3 = employerepository.getAllEmp();
		myempdt3.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		
		System.out.println("Selected employee details");
		List<Emp> myempdt4 = employerepository.getSelectEmp("ALLEN");
		myempdt4.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		
		System.out.println("Selected employee details on basis of Emp and sal");
		List<Emp> myempdt5 = employerepository.getSelectEmpAndSal("ALLEN",1600);
		myempdt5.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		
		System.out.println("Native query");
		List<Emp> myempdt6 = employerepository.geallEmps();
		myempdt6.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		
		System.out.println("Native query getEmpNameNative");
		List<Emp> myempdt7 = employerepository.getEmpNameNative(7369);
		myempdt7.forEach(x->System.out.println(x.getEmpno()+"-"+x.getEname()));
		
		
	}

}
