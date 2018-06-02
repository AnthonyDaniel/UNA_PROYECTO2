package model.Services;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MedicalServiceContainer extends MedicalServiceAdapter implements MedicalServicesInterface{
	private Element cod;
	private Element desc;
	private Element price;
	private Element medService;

	public MedicalServiceContainer() throws Exception {
		super("Services");
	}

	@Override
	public boolean addNode(MedicalService service) throws Exception {
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
        
        NodeList rootNode = document.getElementsByTagName("Service");
        rootNode.item(0).appendChild(medService);
        
        medService.appendChild(cod);
        medService.appendChild(desc);
        medService.appendChild(price);
        
        this.generarXML(document);
		return true;
	}

	@Override
	public MedicalService searchNode(String id) throws Exception {
		DocumentBuilderFactory fabric = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor= fabric.newDocumentBuilder();
        Document document = constructor.parse(url);
        document.getDocumentElement().normalize();        
        NodeList rootNode = document.getDocumentElement().getElementsByTagName("Service");
        
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

}
