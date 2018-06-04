package modelo.clientes.medico;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import modelo.adaptador.adaptadorXML;
import modelo.clientes.clienteEntity;

public class medicoContenedor extends adaptadorXML implements IMedico {

	private Element especialidad;
	private Element id;
	private Element nombre;
	private Element apellidos;
	private Element tel;
	private Element email;
	private Element direccion;
	private Element fecha;
	
	private Element medico;
	
	public medicoContenedor() throws Exception {
		super("Medicos");
	}

	
	public boolean existe(String ced) throws Exception {
		
		boolean exist = false;
		
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Medico");
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(ced)) {
				
				exist = true;
		
			}
			
		}
	
		
		return exist;
	}
	
	public boolean agregar(medicoEntity cli) throws Exception {
		
	
	if(existe(cli.getId())) {
		
		return false;
			
	}else {
		
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		Document documento = constructor.parse(url);
		documento.getDocumentElement().normalize();
		
		medico = documento.createElement("Medico");
		id = documento.createElement("ID");
		nombre = documento.createElement("Nombre");
		apellidos = documento.createElement("Apellidos");
		tel = documento.createElement("Tel");
		email = documento.createElement("Email");
		especialidad = documento.createElement("TelEmergencias");
		direccion = documento.createElement("Direccion");
		fecha = documento.createElement("Fecha");
		
		id.appendChild(documento.createTextNode(cli.getId()));
		nombre.appendChild(documento.createTextNode(cli.getNombre()));
		apellidos.appendChild(documento.createTextNode(cli.getApellidos()));
		tel.appendChild(documento.createTextNode(cli.getTel()));
		email.appendChild(documento.createTextNode(cli.getEmail()));
		especialidad.appendChild(documento.createTextNode(cli.getEspecialidad()));
		direccion.appendChild(documento.createTextNode(cli.getDireccion()));
		fecha.appendChild(documento.createTextNode(cli.getFecha()));
		
		NodeList nodoRaiz = documento.getElementsByTagName("Medicos");
		nodoRaiz.item(0).appendChild(medico);
		
		medico.appendChild(id);
		medico.appendChild(nombre);
		medico.appendChild(apellidos);
		medico.appendChild(tel);
		medico.appendChild(email);
		medico.appendChild(especialidad);
		medico.appendChild(direccion);
		medico.appendChild(fecha);
		
		this.generarXML(documento);
		
		return true;
		
		}
	}

	
	public medicoEntity buscar(String id) throws Exception {
		
	DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Medico");
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(id)) {
				
				medicoEntity cli = new medicoEntity();
				
				cli.setId(nodoRaiz.item(i).getChildNodes().item(0).getTextContent());
		
				cli.setNombre(nodoRaiz.item(i).getChildNodes().item(1).getTextContent());
				
				cli.setApellidos(nodoRaiz.item(i).getChildNodes().item(2).getTextContent());
				
				cli.setTel(nodoRaiz.item(i).getChildNodes().item(3).getTextContent());
				
				cli.setEmail(nodoRaiz.item(i).getChildNodes().item(4).getTextContent());
				
				cli.setEspecialidad(nodoRaiz.item(i).getChildNodes().item(5).getTextContent());
				
				cli.setDireccion(nodoRaiz.item(i).getChildNodes().item(6).getTextContent());
				
				cli.setFecha(nodoRaiz.item(i).getChildNodes().item(7).getTextContent());
		
				JOptionPane.showMessageDialog(null, "Se encontró concidencias");
				
				return cli;
				
			}
			
		}
		 
		JOptionPane.showMessageDialog(null, "No se encontró concidencias");
		
		return null;
	}
	
	
	public boolean modificar(medicoEntity cli) throws Exception {
		
		boolean modificado = false;

		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Medico");
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(cli.getId())) {

				 nodoRaiz.item(i).getParentNode().removeChild(nodoRaiz.item(i));
				
				medico = documento.createElement("Medico");
				id = documento.createElement("ID");
				nombre = documento.createElement("Nombre");
				apellidos = documento.createElement("Apellidos");
				tel = documento.createElement("Tel");
				email = documento.createElement("Email");
				especialidad = documento.createElement("TelEmergencias");
				direccion = documento.createElement("Direccion");
				fecha = documento.createElement("Fecha");
				
				id.appendChild(documento.createTextNode(cli.getId()));
				nombre.appendChild(documento.createTextNode(cli.getNombre()));
				apellidos.appendChild(documento.createTextNode(cli.getApellidos()));
				tel.appendChild(documento.createTextNode(cli.getTel()));
				email.appendChild(documento.createTextNode(cli.getEmail()));
				especialidad.appendChild(documento.createTextNode(cli.getEspecialidad()));
				direccion.appendChild(documento.createTextNode(cli.getDireccion()));
				fecha.appendChild(documento.createTextNode(cli.getFecha()));
				
			    nodoRaiz = documento.getElementsByTagName("Medico");
				nodoRaiz.item(0).appendChild(medico);
				
				medico.appendChild(id);
				medico.appendChild(nombre);
				medico.appendChild(apellidos);
				medico.appendChild(tel);
				medico.appendChild(email);
				medico.appendChild(especialidad);
				medico.appendChild(direccion);
				medico.appendChild(fecha);
				
				this.generarXML(documento);
			
				modificado = true;
		
			}
			
		}

		
			return modificado;
		

	}
	

	
	public boolean eliminar(String ced) throws Exception {

		boolean eliminar = false;
		
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Medico");
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(ced)) {
				
				   nodoRaiz.item(i).getParentNode().removeChild(nodoRaiz.item(i));
         
				   this.generarXML(documento);
				
				eliminar = true;
		
			}
			
		}
	
		
		return eliminar;
		
		
	}



}
