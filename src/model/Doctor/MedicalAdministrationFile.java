package model.Doctor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MedicalAdministrationFile {


	public MedicalAdministrationFile() {
		
	}
	
	protected void write(ArrayList<Doctor> list) {
		
		ObjectOutputStream departure;
		
		try {
			departure = new ObjectOutputStream(new FileOutputStream("Doctor.XML"));
			
			for(int i = 0; i<list.size(); i++) {
				
				departure.writeObject(list.get(i));
				
			}
			
			departure.close();
			
		}catch(IOException e) {
			
			JOptionPane.showMessageDialog(null, "there is an error in writing");
			
		}
		
		
	}
	
	protected ArrayList<Doctor> read() throws FileNotFoundException {
	
		ArrayList<Doctor> listD = new ArrayList<Doctor>();
		Doctor doct;
		ObjectInputStream entry;
		
		try {
			
			entry = new ObjectInputStream(new FileInputStream("Doctor.XML"));
			
			if(entry!=null) {
				
				doct = (Doctor)entry.readObject();
				
				while(doct!=null) {
					
					listD.add(doct);
					doct = (Doctor)entry.readObject();
				}
				
				entry.close();
			}
		
		
		}catch(IOException|ClassNotFoundException e) {
			
	
		
		}
		
		return listD;
	}
	
}
