package ca.bcit.a00843681.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import ca.bcit.a00843681.entity.Employee;

public class EmployeeFacade {

	EntityManager entityManager = null;
	
	public EmployeeFacade(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees(Class<Employee> entityClass){
		
		return entityManager.createQuery("From Employee").getResultList();
	}
}
