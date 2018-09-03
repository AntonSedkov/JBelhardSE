package common.geekBrains.xml;

import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XPathExample {

	public static void main(String[] args) 
			throws ParserConfigurationException, SAXException,
			IOException, XPathExpressionException {
		
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		XPathExpression expr = xpath.compile("//book[author='Neal Stephenson']/title/text()");
		
		Object result = expr.evaluate(new InputSource (new FileReader("book.xml")),	XPathConstants.NODESET);
		
		NodeList nodes = (NodeList) result;
		for (int i = 0; i < nodes.getLength(); i++){
			System.out.println(nodes.item(i).getNodeValue());
		}

	}

}