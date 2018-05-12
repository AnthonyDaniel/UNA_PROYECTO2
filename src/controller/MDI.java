package controller;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.CustomerAdministration;
import model.CustomerAdministrationInterface;
import view.MainGraphicInterface;

public class MDI extends MainGraphicInterface {

	 private CustomerAdministrationInterface client = new CustomerAdministration();
	 private MainGraphicInterface u = new MainGraphicInterface();	 
	
	public MDI() {
		super();
		initController();
	}
	
	private void  initController() {
	
		u.main();
		
	}
	
	
}
