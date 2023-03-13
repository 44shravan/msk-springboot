package com.msk.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.msk.modal.Employee;
import com.msk.serviceimpl.EmpServiceImpl;

@RestController
@RequestMapping("/api")
public class MskController {
	
	@Autowired
	private RestTemplate rt;
	
	@Autowired
    EmpServiceImpl empServiceImpl;
	
	@Value("${msk.name}")
	   private String name;
	
	@GetMapping("/getname")
public String mskTest() {
	return "SUCCESS"+name;
}
	
	@PostMapping("/")
    public void add() {
        empServiceImpl.addEmployee();
    }
  
	@GetMapping("/findall")
	public ArrayList<Employee> getAllEmployee() {
	    return empServiceImpl.findAllEmployee();
	}
  
    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }
  
    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteAllData();
    }
}
