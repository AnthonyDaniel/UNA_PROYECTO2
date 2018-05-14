package model.Doctor;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MedicalAdministration extends MedicalAdministrationFile implements MedicalAdministrationInterface {

	private ArrayList<Doctor> cDoctor;
	
	public MedicalAdministration() {
	
		super();
		
		try {
			cDoctor = this.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public boolean exist(String id) {
		
		boolean exist = false;
		
		if(!cDoctor.isEmpty()) {
			
			for(Doctor i : cDoctor) {
				
				if(i.getId().equals(id)) {
					exist = true;
				}
				
			}
			
		}
		
		return exist;
	}
	
	
	public boolean add(Doctor e) {
		
		
		if(!exist(e.getId())) {
			
			cDoctor.add(e);
			
			this.write(cDoctor);
			
			return true;	
		
		}else {
		
			return false;
		}
	}
	
	public Doctor search(String id) {
		
		Doctor obj = null;
		
		if(exist(id)) {
			
			for(Doctor i: cDoctor ) {
				
				if(i.getId().equals(id)) {
					
					obj = i;
				
				}
				
			}
			
		}
		
		return obj;		
	
	}

	
	public boolean modify(Doctor i) {
	
		boolean modify = false;
		
		if(exist(i.getId())) {
			
			for(Doctor e: cDoctor) {
				
				if(e.getId().equals(i.getId())) {
					
					e.setId(i.getId());
					e.setName(i.getName());
					e.setAddress(i.getAddress());
					e.setDateBirth(i.getDateBirth());
					e.setEmail(i.getEmail());
					e.setSpecialty(i.getSpecialty());
					e.setLastName(i.getLastName());
					e.setPhone(i.getPhone());
					
					modify = true;
				}
			}
		}
		
		this.write(cDoctor);
		
		return modify;		

	}
	
	public boolean remove(String id) {
		
		Doctor aux = new Doctor();
		boolean remove = false;
				
		if(exist(id)) {
			
			for(Doctor i:  cDoctor) {
				
				if(i.getId().equals(id)) {
					
					aux = i;
					remove = true;
					
				}
				
			}
			
		}
		
		cDoctor.remove(aux);
		this.write(cDoctor);
		return remove;
	}

	public ArrayList<Doctor> container() {
		
		if(!cDoctor.isEmpty()) {
			return cDoctor;
		}else {
			return null;
		}
		
	}

	
	
	
	
}
