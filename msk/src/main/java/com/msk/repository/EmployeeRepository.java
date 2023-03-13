package com.msk.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msk.modal.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    //ArrayList<Employee> findAllEmployee();
}
