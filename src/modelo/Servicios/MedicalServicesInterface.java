package modelo.Servicios;


public interface MedicalServicesInterface {
	public boolean addNode(MedicalService service) throws Exception;
    public MedicalService searchNode(String id) throws Exception;
    public boolean deleteNode(String id) throws Exception;
    
    
    // metodo visualizar
    
    
    public void vizualizar() throws Exception;
    
}
