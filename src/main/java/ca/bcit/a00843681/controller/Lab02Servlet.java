package ca.bcit.a00843681.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

import ca.bcit.a00843681.data.EmployeeFacade;
import ca.bcit.a00843681.entity.Employee;

/**
 * Servlet implementation class Lab02Servlet
 */
public class Lab02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Resource
	private UserTransaction userTransaction;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Lab02Servlet doGet()");
		EmployeeFacade ef = new EmployeeFacade(entityManager);
		List<Employee> employees = ef.getEmployees(Employee.class);
		
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
