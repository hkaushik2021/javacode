package com.GetMyDetails.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GetMyDetails.www.model.Employeedetail;
import com.GetMyDetails.www.service.Myservice;

@RestController
public class Getemployeedetail {
	
	@Autowired Myservice mysrvc;

	@RequestMapping(method = RequestMethod.GET,path ="/mydetail")
	public String mydetail()
	{
		System.out.println("functiona called");
		return "Hello Harish";
	}
	
	@GetMapping(path = "/mydetail/{name}")
	public Employeedetail getname(@PathVariable String name)
	{	
//		myemp.setName(String.format("%s", name));
		return new Employeedetail();
	}
	
	@GetMapping(path = "/mydetail/allemp/")
	public List<Employeedetail> getallemp()
	{
		return mysrvc.getallemp();
	}
	

	
	

}
