package modelo.clientes;

public interface ICliente {

	public boolean agregar(clienteEntity cli) throws Exception;
	
	public clienteEntity buscar(String id)throws Exception;
	
	public boolean modificar(clienteEntity cli) throws Exception;
	
	public boolean eliminar(String ced) throws Exception;
	
}
