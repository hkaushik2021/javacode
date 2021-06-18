package com.GetMyDetails.www.model;

public class Employeedetail {
	private String Name;
	private int EmployeeID;
	private float EmployeeSal;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public float getEmployeeSal() {
		return EmployeeSal;
	}
	public void setEmployeeSal(float employeeSal) {
		EmployeeSal = employeeSal;
	}
	public Employeedetail(String name, int employeeID, float employeeSal) {
		super();
		Name = name;
		EmployeeID = employeeID;
		EmployeeSal = employeeSal;
	}
	public Employeedetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
