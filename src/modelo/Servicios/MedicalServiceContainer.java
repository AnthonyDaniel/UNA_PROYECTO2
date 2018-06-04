package modelo.Servicios;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import modelo.adaptador.AdaptadorXML;
import modelo.clientes.clienteEntity;

public class MedicalServiceContainer extends AdaptadorXML implements MedicalServicesInterface{
	private Element cod;
	private Element desc;
	private Element price;
	private Element medService;
	public JComboBox serv = new JComboBox( new String [] { "seleccionar "});

	public MedicalServiceContainer() throws Exception {
		super("Services");
	}
	
public boolean exist(String id) throws Exception {
	boolean exist = false;
	
	DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
	
	DocumentBuilder constructor = fabrica.newDocumentBuilder();
	
	Document documento = constructor.parse(url);
	
	documento.getDocumentElement().normalize();
	
	NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Services");
	
	for(int i = 0; i<nodoRaiz.getLength(); i++) {
		
		if(nodoRaiz.item(i).getChildNodes().item(0).getTextContent().equals(id)) {
			
			exist = true;
	
		}
		
	}

	
	return exist;
	}

	@Override
	public boolean addNode(MedicalService service) throws Exception {
		
		if(exist(service.cod)) {
			return false;
		}
		else {
			DocumentBuilderFactory fabric = DocumentBuilderFactory.newInstance();
	        DocumentBuilder constructor = fabric.newDocumentBuilder();
	        Document document = constructor.parse(url);
	        document.getDocumentElement().normalize();
	        
	        medService = document.createElement("Service");
	        cod = document.createElement("Code");
	        desc = document.createElement("Description");
	        price = document.createElement("Price");
	        
	        cod.appendChild(document.createTextNode(service.getCod()));
	        desc.appendChild(document.createTextNode(service.getDesc()));
	        price.appendChild(document.createTextNode(String.valueOf(service.getPrice())));
	        
	        NodeList rootNode = document.getElementsByTagName("Services");
	        rootNode.item(0).appendChild(medService);
	        
	        medService.appendChild(cod);
	        medService.appendChild(desc);
	        medService.appendChild(price);
	        
	        this.generarXML(document);
			return true;
			
		}
		
	}

	@Override
	public MedicalService searchNode(String id) throws Exception {
		DocumentBuilderFactory fabric = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor= fabric.newDocumentBuilder();
        Document document = constructor.parse(url);
        document.getDocumentElement().normalize();        
        NodeList rootNode = document.getDocumentElement().getElementsByTagName("Services");
        
        for(int i = 0; i < rootNode.getLength(); i++) {
        	if(rootNode.item(i).getChildNodes().item(0).equals(cod)) {
        		MedicalService serv = new MedicalService();
            	serv.setCod(rootNode.item(i).getChildNodes().item(0).getTextContent());
            	serv.setDesc(rootNode.item(i).getChildNodes().item(1).getTextContent());
            	serv.setPrice(Double.valueOf(rootNode.item(i).getChildNodes().item(2).getTextContent()));
        	}
        }
		return null;
	}

	@Override
	public boolean deleteNode(String id) throws Exception {
		DocumentBuilderFactory fabric = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = fabric.newDocumentBuilder();
        Document document = constructor.parse(url);
        document.getDocumentElement().normalize();
        NodeList rootNode = document.getDocumentElement().getElementsByTagName("Service");
        
        for(int i = 0; i < rootNode.getLength(); i++) {
        	if(rootNode.item(i).getChildNodes().item(0).getTextContent().equals(cod)) {
        		rootNode.item(i).getParentNode().removeChild(rootNode.item(i));
        		this.generarXML(document);
        		return true;
        	}
        }
		return false;
	}

	@Override
	public void vizualizar() throws Exception {
DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructor = fabrica.newDocumentBuilder();
		
		Document documento = constructor.parse(url);
		
		documento.getDocumentElement().normalize();
		
		NodeList nodoRaiz = documento.getDocumentElement().getElementsByTagName("Service");
		
		
		
		for(int i = 0; i<nodoRaiz.getLength(); i++) {
			
			
				
				serv.addItem(nodoRaiz.item(i).getChildNodes().item(0).getTextContent());
			
			
			
		}
		 
		JOptionPane.showMessageDialog(null, "No se encontró concidencias");
		
	
		
	}

}
