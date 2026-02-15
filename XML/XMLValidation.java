import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class XMLValidation {
    public static void main(String[] args) {
        try {
            File schemaFile = new File("students_xsd1.xsd");
            File xmlFile = new File("student_xsd.xml");

            SchemaFactory factory =
                SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            Schema schema = factory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlFile));

            System.out.println("XML is Valid");

        } catch (Exception e) {
            System.out.println("XML is NOT Valid");
            System.out.println(e.getMessage());
        }
    }
}
