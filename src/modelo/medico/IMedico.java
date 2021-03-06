package modelo.medico;

import modelo.clientes.clienteEntity;

public interface IMedico {

	public boolean agregar(medicoEntity cE) throws Exception;
	
	public medicoEntity buscar(String id)throws Exception;
	
	public boolean modificar(medicoEntity cli) throws Exception;
	
	public boolean eliminar(String id) throws Exception;
	
}
