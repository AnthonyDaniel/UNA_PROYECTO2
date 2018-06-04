package modelo.clientes;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import modelo.adaptador.AdaptadorXML;


public class clienteContenedor extends AdaptadorXML implements ICliente {

	private Element telEmer;
	private Element id;
	private Element nombre;
	private Element apellidos;
	private Element tel;
	private Element email;
	private Element direccion;
	private Element fecha;
	
	private Element cliente;
	
	public clienteContenedor() throws Exception {
		super("Clientes");
	}

	
	public boolean existe(String ced) throws Exception {
		
		boolean exist = false;
		
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Cliente");
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(ced)) {
				
				exist = true;
		
			}
			
		}
	
		
		return exist;
	}
	
	public boolean agregar(clienteEntity cli) throws Exception {
		
	
	if(existe(cli.getId())) {
		
		return false;
			
	}else {
		
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		Document documento = constructor.parse(url);
		documento.getDocumentElement().normalize();
		
		cliente = documento.createElement("Cliente");
		id = documento.createElement("ID");
		nombre = documento.createElement("Nombre");
		apellidos = documento.createElement("Apellidos");
		tel = documento.createElement("Tel");
		email = documento.createElement("Email");
		telEmer = documento.createElement("TelEmergencias");
		direccion = documento.createElement("Direccion");
		fecha = documento.createElement("Fecha");
		
		id.appendChild(documento.createTextNode(cli.getId()));
		nombre.appendChild(documento.createTextNode(cli.getNombre()));
		apellidos.appendChild(documento.createTextNode(cli.getApellidos()));
		tel.appendChild(documento.createTextNode(cli.getTel()));
		email.appendChild(documento.createTextNode(cli.getEmail()));
		telEmer.appendChild(documento.createTextNode(cli.getTelEmer()));
		direccion.appendChild(documento.createTextNode(cli.getDireccion()));
		fecha.appendChild(documento.createTextNode(cli.getFecha()));
		
		NodeList nodoRaiz = documento.getElementsByTagName("Clientes");
		nodoRaiz.item(0).appendChild(cliente);
		
		cliente.appendChild(id);
		cliente.appendChild(nombre);
		cliente.appendChild(apellidos);
		cliente.appendChild(tel);
		cliente.appendChild(email);
		cliente.appendChild(telEmer);
		cliente.appendChild(direccion);
		cliente.appendChild(fecha);
		
		this.generarXML(documento);
		
		return true;
		
		}
	}

	
	public clienteEntity buscar(String id) throws Exception {
		
	DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Cliente");
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(id)) {
				
				clienteEntity cli = new clienteEntity();
				
				cli.setId(nodoRaiz.item(i).getChildNodes().item(0).getTextContent());
		
				cli.setNombre(nodoRaiz.item(i).getChildNodes().item(1).getTextContent());
				
				cli.setApellidos(nodoRaiz.item(i).getChildNodes().item(2).getTextContent());
				
				cli.setTel(nodoRaiz.item(i).getChildNodes().item(3).getTextContent());
				
				cli.setEmail(nodoRaiz.item(i).getChildNodes().item(4).getTextContent());
				
				cli.setTelEmer(nodoRaiz.item(i).getChildNodes().item(5).getTextContent());
				
				cli.setDireccion(nodoRaiz.item(i).getChildNodes().item(6).getTextContent());
				
				cli.setFecha(nodoRaiz.item(i).getChildNodes().item(7).getTextContent());
		
				JOptionPane.showMessageDialog(null, "Se encontró concidencias");
				
				return cli;
				
			}
			
		}
		 
		JOptionPane.showMessageDialog(null, "No se encontró concidencias");
		
		return null;
	}
	
	//Dos modulos que no funcionan
	
	public boolean modificar(clienteEntity cli) throws Exception {
		
		boolean modificado = false;

		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Cliente");
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(cli.getId())) {

				 nodoRaiz.item(i).getParentNode().removeChild(nodoRaiz.item(i));
				
				cliente = documento.createElement("Cliente");
				id = documento.createElement("ID");
				nombre = documento.createElement("Nombre");
				apellidos = documento.createElement("Apellidos");
				tel = documento.createElement("Tel");
				email = documento.createElement("Email");
				telEmer = documento.createElement("TelEmergencias");
				direccion = documento.createElement("Direccion");
				fecha = documento.createElement("Fecha");
				
				id.appendChild(documento.createTextNode(cli.getId()));
				nombre.appendChild(documento.createTextNode(cli.getNombre()));
				apellidos.appendChild(documento.createTextNode(cli.getApellidos()));
				tel.appendChild(documento.createTextNode(cli.getTel()));
				email.appendChild(documento.createTextNode(cli.getEmail()));
				telEmer.appendChild(documento.createTextNode(cli.getTelEmer()));
				direccion.appendChild(documento.createTextNode(cli.getDireccion()));
				fecha.appendChild(documento.createTextNode(cli.getFecha()));
				
			    nodoRaiz = documento.getElementsByTagName("Clientes");
				nodoRaiz.item(0).appendChild(cliente);
				
				cliente.appendChild(id);
				cliente.appendChild(nombre);
				cliente.appendChild(apellidos);
				cliente.appendChild(tel);
				cliente.appendChild(email);
				cliente.appendChild(telEmer);
				cliente.appendChild(direccion);
				cliente.appendChild(fecha);
				
				this.generarXML(documento);
				
		
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
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Cliente");
		
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
