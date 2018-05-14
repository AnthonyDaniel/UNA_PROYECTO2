package model.Client;

import java.util.ArrayList;

public interface CustomerAdministrationInterface {

	
	public boolean add(Client e);
	
	public Client search(String id);
	
	public boolean modify(Client i);
	
	public boolean remove(String id);
	
	public ArrayList<Client> container();
	
	
}
