package spring2;

import java.sql.Date;

public class Employee 
{
	private int id;
	private String name;
	private Address address;
	
	
	
	
	
	

	public Employee() {
		super();
		System.out.println("hello emp default constructor");
	}

	

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("constructor injection");
	}



	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address +"]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	

}
