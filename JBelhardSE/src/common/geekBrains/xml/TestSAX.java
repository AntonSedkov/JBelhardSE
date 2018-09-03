package common.geekBrains.xml;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestSAX extends DefaultHandler {

	private String result;

	public void startDocument() throws SAXException {
		System.out.println("Start parse XML ...");
	}

	@Override
	// localName - название элемента, qName - название атрибута.
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
		// им€ тега
		result += "Element name '" + qName + "'\n";

		// атрибуты тега
		for (int i = 0; i < atts.getLength(); i++) {
			result += "Attribute name = '" + atts.getQName(i) + "'; " + "Attributes value = '" + atts.getValue(i)
					+ "'\n";
		}
	}

	@Override
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
		// закрытие тега
		result += "Element closed, name = '" + qName + "'\n";
	}

	@Override
	public void endDocument() {
		System.out.println("Stop parse XML...");
	}

	public String getResult() {
		return result;
	}

	public static void main(String[] args) {
		final String PATH = "test.xml";
		File input = new File(PATH);
		// ¬ходной файл, содержащий XML документ
		// SAX парсер
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			TestSAX handler = new TestSAX();
			parser.parse(input, handler);
			System.out.println("SAX parser result:\n" + handler.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}