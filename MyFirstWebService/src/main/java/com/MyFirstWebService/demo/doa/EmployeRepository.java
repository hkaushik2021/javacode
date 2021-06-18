package com.MyFirstWebService.demo.doa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.MyFirstWebService.demo.entities.Emp;

import java.util.List;

public interface EmployeRepository extends CrudRepository<Emp, Integer>{
public List<Emp> findByEname(String name);
public List<Emp> findBySal(float sal);
public List<Emp> findByEnameAndSal(String name,float sal);
public List<Emp> findByEnameStartingWith (String prefix);

@Query("select e from Emp e")
public List<Emp> getAllEmp();

@Query("select e from Emp e where e.ename= :n")
public List<Emp> getSelectEmp(@Param("n") String Emp);

@Query("select e from Emp e where e.ename= :n and e.sal =:s")
public List<Emp> getSelectEmpAndSal(@Param("n") String Emp,@Param ("s") float sal);

@Query(value="select ename,empno,sal from Emp",nativeQuery = true)
public List<Emp> geallEmps();

@Query(value="select ename,empno,sal from Emp e where e.empno = :empno",nativeQuery = true)
public List<Emp> getEmpNameNative(int empno);

}
