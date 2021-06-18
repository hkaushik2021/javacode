package com.GetEmployeeDetails.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.GetEmployeeDetails.constants.Myconstants;
import com.GetEmployeeDetails.entity.emp;

@Repository
public interface Employeedao extends CrudRepository<emp, Integer> {
	
	
	@Query(Myconstants.query1)
	List<emp> getallemp();
	
	@Query(Myconstants.query2)
	List<emp> getEmpDetailByEmpid (@Param("n")  int empid);

}
