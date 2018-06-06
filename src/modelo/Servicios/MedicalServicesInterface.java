package modelo.Servicios;

import java.awt.Component;

import javax.swing.JComboBox;

public interface MedicalServicesInterface {
	public boolean addNode(MedicalService service) throws Exception;
    public MedicalService searchNode(String id) throws Exception;
    public boolean deleteNode(String id) throws Exception;
    
    
    // metodo visualizar
    
    
    public JComboBox display() throws Exception;
    
}
