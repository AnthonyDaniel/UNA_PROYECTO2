package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CustomerAdministrationFile {

	public CustomerAdministrationFile () {
		
	}
	
	protected void write(ArrayList<Client> list) {
		
		ObjectOutputStream departure;
		
		try {
			departure = new ObjectOutputStream(new FileOutputStream("Client.XML"));
			
			for(int i = 0; i<list.size(); i++) {
				
				departure.writeObject(list.get(i));
				
			}
			
			departure.close();
			
		}catch(IOException e) {
			
			JOptionPane.showMessageDialog(null, "there is an error in writing");
			
		}
		
		
	}
	
	protected ArrayList<Client> read() throws FileNotFoundException {
	
		ArrayList<Client> list = new ArrayList<Client>();
		Client customer;
		ObjectInputStream entry;
		
		try {
			
			entry = new ObjectInputStream(new FileInputStream("Client.XML"));
			
			if(entry!=null) {
				
				customer = (Client)entry.readObject();
				
				while(customer!=null) {
					
					list.add(customer);
					customer = (Client)entry.readObject();
				}
				
				entry.close();
			}
		
		
		}catch(IOException|ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "There is an error in reading or there is nothing in memory", "Client-There is an unforeseen", JOptionPane.WARNING_MESSAGE);
		
		
		}
		
		return list;
	}
	
}
