package model;

import java.io.Serializable;

public class Client extends Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private String EmergencyPerson;
	
	public Client() {
		super();
	}


	public String getEmergencyPerson() {
		return EmergencyPerson;
	}


	public void setEmergencyPerson(String emergencyPerson) {
		EmergencyPerson = emergencyPerson;
	}
	
	
}
