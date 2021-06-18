package com.GetMyDetails.www.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp")
public class emp {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int empno;
private float sal;
private String ename;


public emp() {
	super();
	// TODO Auto-generated constructor stub
}

public emp(int empno, float sal, String ename) {
	super();
	this.empno = empno;
	this.sal = sal;
	this.ename = ename;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public float getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

	
}
