package com.example.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.entity.repo.AddressRepo;
import com.example.demo.entity.repo.EmployeeRepo;

@Service
public class CommonService {
	@Autowired
	private EmployeeRepo repo;
	@Autowired
	private AddressRepo repo1;
	public void saveEmployee() {
		  Address adr = new Address();
		          adr.setCity("Srikakulam");
		          adr.setState("Andhrapradesh");
		          adr.setCountry("India");
		          adr.setAddressType("permanent");
		          
		          Address adr1 = new Address();
		          adr1.setCity("Hyderabad");
		          adr1.setState("Telangana");
		          adr1.setCountry("India");
		          adr1.setAddressType("Temporary");
		          
		          Employee emp = new Employee();
		          emp.setEmpName("Ganesh");
		          emp.setEmpSalary(50000.05);
		          //association
		          adr.setEmp(emp);
		          adr1.setEmp(emp);
		          emp.setAdr(Arrays.asList(adr,adr1));
		          
		          repo.save(emp);
		         
		          
		          
		          
		          
	}

}
