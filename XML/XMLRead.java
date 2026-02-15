import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;

public class XMLRead {
    public static void main(String[] args) {
        try {
            File file = new File("student_xsd.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList list = doc.getElementsByTagName("student");

            for (int i = 0; i < list.getLength(); i++) {
                Element student = (Element) list.item(i);

                System.out.println("Roll No: " + student.getAttribute("rollNo"));
                System.out.println("Name: " + 
                    student.getElementsByTagName("name").item(0).getTextContent());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
