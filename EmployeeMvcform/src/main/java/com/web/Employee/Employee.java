package com.web.Employee;

public class Employee {
	private String empno;
	private String name;
	private double salary;
	private double ta;
	private double da;
	private double hra;
	private double pf;
	private double netsalary;
	private double grasssalary;
	public Employee(String empno, String name, double salary, double ta, double da, double hra, double pf,
			double netsalary, double grasssalary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.netsalary = netsalary;
		this.grasssalary = grasssalary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(double netsalary) {
		this.netsalary = netsalary;
	}
	public double getGrasssalary() {
		return grasssalary;
	}
	public void setGrasssalary(double grasssalary) {
		this.grasssalary = grasssalary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", ta=" + ta + ", da=" + da
				+ ", hra=" + hra + ", pf=" + pf + ", netsalary=" + netsalary + ", grasssalary=" + grasssalary + "]";
	}
}