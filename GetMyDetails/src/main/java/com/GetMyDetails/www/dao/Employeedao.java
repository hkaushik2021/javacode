package com.GetMyDetails.www.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GetMyDetails.www.contants.Myconstants;
import com.GetMyDetails.www.entity.emp;

@Repository
public interface Employeedao extends CrudRepository<emp, Integer> {
	
	
	@Query(Myconstants.query1)
	List<emp> getallemp();

}
