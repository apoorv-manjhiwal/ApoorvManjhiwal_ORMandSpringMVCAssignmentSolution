package com.greatlearning.customerManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.autowired;
import org.springframework.web.bind.annotation.requestMapping;

import org.springframework.ui.Model;

@Controller
@requestMapping("/customer")
public class CustomerController {

	@autowired

	private customerService customerService;

	@RequestMappping("/list")
	public String listcustomer(Model model) {

		List<Customer> customers = customerService.findAll();
		model.addAttribute("Customer", customers);

		return "list-customers";

	}

	@PostMappping("/save")
	public String listStudent(@RequestParam("id") int id, @RequesParam("firstName") String firstName,
			@RequesParam("lastName") String lastName, @RequesParam("email") String email)
			 {

		Customer customer;
		if (id !=0) {
			customer = customerService.findById(id);
			customer.setFirstName(firstName);
			customer.setEmail(email);
			customer.setLastName(lastName);

		} else {
			customer = new Customer(firstName, lastName, email);

		}
		customerService.save(customer);

		return "redirect:/customer/list";
	}

	@RequestMappping("/showFormForAdd")
	public String listCustomer(Model model) {

		Customer customer = new customer();
		model.addAttribute("customer", customer);

		return "customer-form";

	}

	@RequestMappping("/delete")
	public String deleteCustomer(@RequestParam("id") int id) {

		customerService.deleteById(id);

		return "redirect:/customer/list";

	}

	@RequestMappping("/showFormForUpdate")
	public String deleteCustomer(@RequestParam("id") int id, Model model) {

		Customer customer = customerService.findById(id);

		model.addAttribute("customer", customer);

		return "customer-form";

	}

}
