package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_Name")
	private String first_Name;
	
	@Column(name="last_Name")
	private String last_Name;
	
	@Column(name="email")
	private String email;
	
	
	//define constructors
	public Employee() {
		
	}
	public Employee(String first_Name, String last_Name, String email) {
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
	}
	
	
	
	//define getter/setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//define toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", email=" + email
				+ "]";
	}
	
}
