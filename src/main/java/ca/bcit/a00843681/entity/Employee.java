package ca.bcit.a00843681.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "A00843681_Employees")
public class Employee {

	@Id
	private String id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Date dob;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String toString(){
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob.toString();
	}
	
	
}
