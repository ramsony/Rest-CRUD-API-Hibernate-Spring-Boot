package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImp implements EmployeeDao {
	
	//Define field for entitymanager
	
	private EntityManager entityManager;
	
	
	//setup constructor injection
	@Autowired
	public EmployeeDAOHibernateImp(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create a query
		Query<Employee> theQuery =
				currentSession.createQuery("from Employee", Employee.class);
		
		//excute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		//return the results
		
		
		return employees;
	}

}
