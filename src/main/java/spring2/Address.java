package spring2;

import java.util.Date;

public class Address
{
	private int zip;
	private String city;
	private String state ;
	
	private Date date;
	
	
	
	
	
	
	public int getZip() {
		return zip;
	}






	public void setZip(int zip) {
		this.zip = zip;
	}






	public String getCity() {
		return city;
	}






	public void setCity(String city) {
		this.city = city;
	}






	public String getState() {
		return state;
	}






	public void setState(String state) {
		this.state = state;
	}






	public Date getDate() {
		return date;
	}






	public void setDate(Date date) {
		this.date = date;
	}






	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Address(int zip, String city, String state) {
		super();
		this.zip = zip;
		this.city = city;
		this.state = state;
	}






	@Override
	public String toString() {
		return "Address [zip=" + zip + ", city=" + city + ", state=" + state + ", date=" + date + "]";
	}







	

}
