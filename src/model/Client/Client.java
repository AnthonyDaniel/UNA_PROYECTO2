package model.Client;

import java.io.Serializable;
import java.util.Date;

public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	private String EmergencyPerson;
	private String id;
	private String name;
	private String lastName;
	private String phone;
	private String email;
	private String address;
	private Date dateBirth;
	
	
	public Client() {
		super();
	}


	public String getEmergencyPerson() {
		return EmergencyPerson;
	}


	public void setEmergencyPerson(String emergencyPerson) {
		EmergencyPerson = emergencyPerson;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getDateBirth() {
		return dateBirth;
	}


	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	
}
