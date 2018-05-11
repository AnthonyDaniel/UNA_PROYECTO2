package model;

import java.io.Serializable;

public class Doctor extends Person implements Serializable {

	private String specialty;
	
	public Doctor() {
		super();
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	
}
