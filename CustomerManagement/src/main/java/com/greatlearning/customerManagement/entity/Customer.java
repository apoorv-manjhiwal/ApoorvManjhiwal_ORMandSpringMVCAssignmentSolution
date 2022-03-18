package com.greatlearning.customerManagement.entity;

import javax.persistence.Entity;
import javax.persistence.table;

import com.greatlearning.customerManagement.entity.Column;

import javax.persistence.Id;
import javax.persistence.generatedValue;
import javax.persistence.generationType;
@Entity
@Table(name="customer")

public class Customer {
	
	@Id	
	@generatedValue(strategy=GenerationType.INDENTITY)
	@Column(name="id")
	
	



	private int id;
	@Column(name="firstName")
	
	private String firstName;
	private String lastName;
	private String email;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return getLastName();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setCourse(String email) {
		this.email = email;
	}


	public class Student {
		private String firstName;

		@Override
		public String toString() {
			return "Student [id=" + id + ", firstName=" + "firstName" + ", lastName=" + lastName + ", email=" + "email"
					]";"
		}
		public Student() {
			
			
		}
	public Student(String lastName, String email) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;

		}
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	
	


}
}
