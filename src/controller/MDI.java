package controller;

import view.MainGraphicInterface;

public class MDI {

	private MainGraphicInterface graphic = new MainGraphicInterface();

	
	public MDI() {
		initController();
	}
	
	
	private void initController() {
		
		graphic.main();
		
	}
}