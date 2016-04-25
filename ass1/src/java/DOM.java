
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOM {

    public void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = factory.newDocumentBuilder();
        InputStream xmlStream = DOM.class.getResourceAsStream("features.xml");
        Document doc = docBuilder.parse(xmlStream);
        NodeList list = doc.getElementsByTagName("*");
        System.out.println("ID\tEmail\t\t\tPassword\tTemplate ID");

        for (int i = 0; i < list.getLength(); i++) {
            Element element = (Element) list.item(i);
            String nodeName = element.getNodeName();

            if (nodeName.equals("feature")) {
                String personId = element.getAttribute("id");
                System.out.print(personId + "\t");
            } else if (nodeName.equals("email")) {
                System.out.print(element.getChildNodes().item(0).getNodeValue() + "\t");
            } else if (nodeName.equals("password")) {
                System.out.print(element.getChildNodes().item(0).getNodeValue() + "\t");
            } else if (nodeName.equals("templateid")) {
                System.out.println(element.getChildNodes().item(0).getNodeValue() + "\t");
            }
        }
    }
}
