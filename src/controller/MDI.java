package controller;

import model.CustomerAdministration;
import model.CustomerAdministrationInterface;
import view.MainGraphicInterface;

public class MDI {

	 private CustomerAdministrationInterface client = new CustomerAdministration();

	
	public MDI() {
		initController();
	}
	
	private void  initController() {
		
		MainGraphicInterface u = new MainGraphicInterface();		
		
		u.main();
		
	}
	
	private void subG() {
		
		
		
	}
	
}
