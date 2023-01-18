package com.cloudrun.microservicetemplate;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@Column(name="ID")
	private Integer empId;
	
	@Column(name="NAME")
	private String name;
	
	// @Column(name="SALARY")
	// private Integer salary;
	
	@Column(name="DEPT_ID")
	private Integer deptId;
	
	@Column(name="MANAGER_ID")
	private Integer managerId;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public Integer getSalary() {
	// 	return salary;
	// }

	// public void setSalary(Integer salary) {
	// 	this.salary = salary;
	// }

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	
}

