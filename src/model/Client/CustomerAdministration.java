package model.Client;


import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustomerAdministration  extends CustomerAdministrationFile implements CustomerAdministrationInterface {

	private ArrayList<Client> cClient; 
	
	public CustomerAdministration() {

		super();
		
		try {
			cClient = this.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public boolean exist(String id) {
		
		boolean exist = false;
		
		if(!cClient.isEmpty()) {
			
			for(Client i : cClient) {
				
				if(i.getId().equals(id)) {
					exist = true;
				}
				
			}
			
		}
		
		return exist;
	}
	
	
	public boolean add(Client e) {
		
		
		if(!exist(e.getId())) {
		
			 cClient.add(e);
			 this.write(cClient);
			 return true;
		}else {
			return false;
		}
	}
	
	public Client search(String id) {
		
		Client obj = null;
		
		if(exist(id)) {
			
			for(Client i: cClient ) {
				
				if(i.getId().equals(id)) {
					obj = i;
				}
				
			}
			
		}
		
		return obj;		
	
	}

	
	public boolean modify(Client i) {
	
		boolean modify = false;
		
		if(exist(i.getId())) {
			
			for(Client e: cClient) {
				
				if(e.getId().equals(i.getId())) {
					
					e.setId(i.getId());
					e.setName(i.getName());
					e.setAddress(i.getAddress());
					e.setDateBirth(i.getDateBirth());
					e.setEmail(i.getEmail());
					e.setEmergencyPerson(i.getEmergencyPerson());
					e.setLastName(i.getLastName());
					e.setPhone(i.getPhone());
					
					modify = true;
				}
			}
		}
		
		this.write(cClient);
		return modify;		

	}
	
	public boolean remove(String id) {
		
		Client aux = new Client();
		boolean remove = false;
				
		if(exist(id)) {
			
			for(Client i:  cClient) {
				
				if(i.getId().equals(id)) {
					
					aux = i;
					remove = true;
					
				}
				
			}
			
		}
		
		cClient.remove(aux);
		this.write(cClient);
		return remove;
	}

	public ArrayList<Client> container() {
		
			return cClient;

	}
	
}
