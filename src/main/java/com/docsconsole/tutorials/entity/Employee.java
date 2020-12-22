package com.docsconsole.tutorials.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "EMPLOYEE" )
public class Employee {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID")
	private Integer empId;

	@Column(name = "EMP_FIRST_NAME")
	private String empFirstName;

	@Column(name = "EMP_LAST_NAME")
	private String EmpLastName;

	public Employee() {
	}

	public Employee(Integer empId, String empFirstName,String EmpLastName) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.EmpLastName = EmpLastName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return EmpLastName;
	}

	public void setEmpLastName(String empLastName) {
		EmpLastName = empLastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
