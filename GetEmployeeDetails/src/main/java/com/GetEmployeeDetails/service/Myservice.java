package com.GetEmployeeDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GetEmployeeDetails.dao.Employeedao;
import com.GetEmployeeDetails.entity.emp;
import com.GetEmployeeDetails.model.Employeedetail;

@Service
public class Myservice {

@Autowired 
Employeedao empdao;
 public List<Employeedetail> getallemp()
 {
	 List<Employeedetail> emplst = new ArrayList<Employeedetail>();
	 List<emp> myemplst = empdao.getallemp();
	 myemplst.forEach(x-> {
		 emplst.add(new Employeedetail(x.getEname(),x.getEmpno(),x.getSal()));
	 });
	 
	 return emplst;
 }
 
 public List<Employeedetail> getEmpDetail(int empno)
 {
	 List<Employeedetail> emplst = new ArrayList<Employeedetail>();
	 List<emp> myemplst = empdao.getEmpDetailByEmpid(empno);
	 
	myemplst.forEach(x-> {
		emplst.add(new Employeedetail(x.getEname(),x.getEmpno(),x.getSal()));
		
	});
	return emplst;
 }
}
