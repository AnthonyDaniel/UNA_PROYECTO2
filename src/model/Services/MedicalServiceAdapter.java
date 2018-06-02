package model.Services;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class MedicalServiceAdapter {
	protected String url;
    public MedicalServiceAdapter(String entidad)throws Exception{
        url=entidad+"XML.xml"; //url=ArticuloXML.xml
        if(!(new File(url).exists())){
            crearXML(entidad);
        }
    }
    protected void crearXML(String root)throws Exception{
        Document documento;
        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder contructor = fabrica.newDocumentBuilder();
        DOMImplementation implementacion = contructor.getDOMImplementation();
        documento = implementacion.createDocument(null,"xml", null);
        documento.setXmlVersion("1.0");
        documento.getDocumentElement().appendChild(
                documento.createElement(root));
        generarXML(documento);
    }
    protected void generarXML(Document doc)throws Exception{
        Result resultado = new StreamResult(new File(url));
        Source fuente = new DOMSource(doc);
        Transformer transformador= TransformerFactory.newInstance()
                .newTransformer();
        transformador.transform(fuente, resultado);
    }
}
