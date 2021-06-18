package com.MyFirstWebService.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emp {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer empno ;
	
	private String ename;
	private float sal;
	
	
	
	public Emp(int empno, String ename, float sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public float getSal() {
		return sal;
	}



	public void setSal(float sal) {
		this.sal = sal;
	}



	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
