package com.greatlearning.customerManagement.service;

import org.springframework.stereotype.Repository;

import com.greatlearning.customerManagement.entity.Customer;
import com.greatlearning.customerManagement.service.Autowired;
import com.greatlearning.customerManagement.service.HibernateException;
import com.greatlearning.customerManagement.service.List;
import com.greatlearning.customerManagement.service.Session;
import com.greatlearning.customerManagement.service.SessionFactory;
import com.greatlearning.customerManagement.service.Transaction;
import com.greatlearning.customerManagement.service.Transactional;
import com.greatlearning.customerManagement.service.Trasaction;

@Repository
public class CustomerServiceImpl implements CustomerService {
	
	private SessionFactory sessionFactory;
	
	private Session session;
	
	@Autowired
	CustomerServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
		try {
			session = sessionFactory.getCurrentSession();
			
		}
		catch(HibernateException e) {
			session = sessionFactory.openSession();
			
		}
	}
@Transactional	
public List<Customer> findAll() {
	Trasaction tx = session.beginTransaction();
	List<Customer> customers.session.createQuery("from customer").list();
	tx.commit();
	return customers;
}

	public Customer findById(int id) {
		Transaction tx = session.beginTransaction();
		
		Customer customer = session.get(Customer.class, id);
		
		tx.commit();
		return customer;

		
		
		
				
	}
	public void save( Customer customer) {
		Trasaction tx = session.beginTransaction();
		
		session.saveOrUpdate(customer);
		
		tx.commit();
		
	}
	public void deleteById(int id) {
		
		Transaction tx = session.beginTransaction();
		
		Customer customer = session.get(Customer.class, id);
		
		session.delete(customer);
		
		tx.commit();
		
		
	}

}
