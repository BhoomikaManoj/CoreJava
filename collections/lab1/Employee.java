package com.uttara.collections.lab1;

import java.util.Date;

public class Employee {

	String name;
	String email;
	Date dob;
	Address address;
	
	
	public Employee(String name, String email, Date dob, Address address) {
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", dob=" + dob + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Employee)
		{
			Employee emp = (Employee) obj;
			if(this.name.equals(emp.name) && this.email.equals(emp.email) && this.dob.equals(emp.dob) && this.address.equals(address))
				return true;
			else
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Address addr1 = new Address("Shimoga","vinoba nagar layout",566203,0);
		Address addr2 = new Address("changiri","SMS layout",5660201,0);
		
		Employee emp1 = new Employee("Bhoomi","a@gmial.com",new Date(21/04/1995),addr1);
		Employee emp2 = new Employee("Bhoomi","a@gmial.com",new Date(21/04/1995),addr1);
		Employee emp3 = new Employee("Bhoomika","a@gmial.com",new Date(21/04/1995),addr1);
		Employee emp4 = new Employee("Bhoomika","a@gmial.com",new Date(21/04/1995),addr2);
		System.out.println(emp1);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1.equals(emp4));
	}

}
