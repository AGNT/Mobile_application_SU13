import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Main class that provide random Location stored in the file data.xml.
 * 
 * The parsing code is taken from : 
 * http://javarevisited.blogspot.com/2011/12/parse-xml-file-in-java-example-tutorial.html
 */
public class Location {
	
	private final static String SEPARATOR = ":";
	private final static String FILENAME = "data.xml";
	
	public static String getNext() {
		try {

			// Retrieving the data.
			Document doc = getXMLDocument(FILENAME);
			
			if(doc == null) {
				throw new RuntimeException("Unable to open xml file");
			}

			// Getting all the locations.
			NodeList nodes = doc.getElementsByTagName("location");
			
			// Getting a random node.
			Node node = nodes.item(new Random().nextInt(nodes.getLength()));
			
			// Checking the type of the node.
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				return formatResult((Element) node);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	
	/**
	 * Format the location in a understandable format for the client.
	 * @param element The location choosed.
	 * @return The formatted String.
	 */
	private static String formatResult(Element element) {
		return getValue("name", element) + SEPARATOR 
			   + getValue("latitude", element) + SEPARATOR 
			   + getValue("longitude", element);
	}
	
	/**
	 * Return the value of a child node.
	 * @param tag Name of child node.
	 * @param element Node element
	 * @return The text of the child node.
	 */
	private static String getValue(String tag, Element element) {
	NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
	Node node = (Node) nodes.item(0);
	return node.getNodeValue();
	}
	
	/**
	 * Retrieve the data contained in the xml document.
	 * @param filename Name of the xml file.
	 * @return The XML document ready to be parsed.
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	private static Document getXMLDocument(String filename) throws ParserConfigurationException, SAXException, IOException {
		File stocks = new File(filename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(stocks);
		
		doc.getDocumentElement().normalize();
		return doc;
	}
}