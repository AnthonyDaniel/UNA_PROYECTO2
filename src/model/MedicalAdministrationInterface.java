package model;

import java.util.ArrayList;

public interface MedicalAdministrationInterface {

	public boolean add(Doctor e);
	
	public Doctor search(String id);
	
	public boolean modify(Doctor i);
	
	public boolean remove(String id);
	
	public ArrayList<Doctor> container();
		
}
