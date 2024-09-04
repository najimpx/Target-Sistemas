package ex6;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Collections;

//ex3 para avaliação tecnica Target Sistemas
//usando arquivo xml como base
public class main {
	
	static void achavalores(Document  xmlfaturamento) {
	    NodeList diario = xmlfaturamento.getElementsByTagName("row");
	    List<Double> lista = new ArrayList<>();
	    
	    //preenche list lista com os valores do xml
        for (int i = 0; i < diario.getLength(); i++) {
            Node diaNode = diario.item(i);
            if (diaNode.getNodeType() == Node.ELEMENT_NODE) {
                Element diaElement = (Element) diaNode;
                if(diaElement.getElementsByTagName("valor").item(0) != null) {
	                double valor = Double.parseDouble(diaElement.getElementsByTagName("valor").item(0).getTextContent());
	                //ignora feriados
	                if (valor > 0) {
	                	lista.add(valor);
	                }
                }
            }
        }
        
        //collections ordena a lista
        if(!lista.isEmpty()) {
	        Collections.sort(lista);
	        System.out.println("Maior faturamento do dia "+ lista.get(lista.size() - 1));
	        System.out.println("Menor faturamento do dia " + lista.get(0));
        } else {
            System.out.println("Faturamento nulo");
        }
        return;
	}
	
	public static void main(String[] args){
		try {
			//mudar caminho para endereço apropriado
			File arquivo = new File("C:\\Users\\Rafae\\eclipse-workspace\\Target\\src\\ex3\\dados.xml");
			DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = Factory.newDocumentBuilder();
		    Document  xmlfaturamento= builder.parse(arquivo);
		    xmlfaturamento.getDocumentElement().normalize();
		    //algoritmo principal
		    achavalores(xmlfaturamento);
		    
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return;
	}
}
