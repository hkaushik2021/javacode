package com.GetMyDetails.www.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.GetMyDetails.www.dao.Employeedao;
import com.GetMyDetails.www.model.Employeedetail;
import com.GetMyDetails.www.entity.emp;

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
}
