package com.greatlearning.customerManagement.service;
import com.greatlearning.customerManagement.entity.Customer;
import com.greatlearning.studentManagement.entity.Student;
import com.greatlearning.studentManagement.service.List;

public interface customerService {
	
	public List<Customer> findAll();
	public Customer findById(int id);
	public void save( Customer customer);
	public void deleteById(int id);

}
