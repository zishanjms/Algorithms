package harsha;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadConfigurationFile {

	public static Map<String, Market> marketMap = new HashMap<String, Market>();

	public static void main(String[] args) {
		readXmlFile("C:/WorkSpace/MHEGenerator/Challanges/src/harsha/LTEProfileData.xml");
	}

	public static void readXmlFile(String path) {
		try {
			File fXmlFile = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("Market");

			for (int i = 0; i < nList.getLength(); i++) {

				org.w3c.dom.Node nNode = nList.item(i);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element marketElement = (Element) nNode;
					String marketName = marketElement.getAttribute("Name");
					Market market = new Market(marketName);

					marketMap.put(marketName, market);
					// System.out.println("market map ; "+marketMap);

					// get all nodes
					NodeList technoLogyNodeList = marketElement
							.getElementsByTagName("Technology");
					for (int j = 0; j < technoLogyNodeList.getLength(); j++) {

						Node technologyNode = technoLogyNodeList.item(j);
						Element technologyElement = (Element) technologyNode;
						String technologyType = technologyElement
								.getAttribute("Type");

						Technology tech = new Technology(technologyType);
						market.addTechnolgy(tech);

						/*int count = technologyElement.getElementsByTagName(
								"SAPCProfile").getLength();
						System.out.println("count : "+count);
						for (int a = 0; a < count; a++) {*/
							NodeList SAPCNodeList = technologyElement
									.getElementsByTagName("SAPCProfile");
							for (int k = 0; k < SAPCNodeList.getLength(); k++) {

								Node profileNode = SAPCNodeList.item(k);
								Element profileElement = (Element) profileNode;
								String profilekey = profileElement
										.getAttribute("key");

								SAPCProfile profile = new SAPCProfile();
								profile.setKey(profilekey);
								processProfileNode(profile, profileElement);
								tech.addSAPCProfile(profile);
							}
					}
				}
			}
			System.out.println("SAPCProfileList : " + marketMap.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	public static void processProfileNode(SAPCProfile profile,
			Element profileElement) {

		Node nextSibling = profileElement.getFirstChild().getNextSibling();

		while (nextSibling != null) {
			if (nextSibling.getNodeType() == Node.ELEMENT_NODE) {
				String siblingNodeName = nextSibling.getNodeName();
				String siblingNodeValue = (nextSibling.getFirstChild()
						.toString()).replaceFirst("#text: ", "").trim()
						.replaceAll("\\[", "").replaceAll("\\]", "");
				;
				// int siblingNodeIntValue = Integer.parseInt(siblingNodeValue);
				switch (siblingNodeName) {
				case "ID":
					profile.setID(siblingNodeValue);
					break;
				case "CumulativeQuotaGreaterThan":
					profile.setCumulativeQuotaGreaterThan(siblingNodeValue);
					String quotaUnit = ((Element)nextSibling).getAttribute("QuotaUnit");
					profile.setQuotaUnit(quotaUnit);
					break;
				case "key":
					profile.setKey(siblingNodeValue);
					break;
				case "CumulativeQuotalessThan":
					profile.setCumulativeQuotalessThan(siblingNodeValue);
					break;
				case "QuotaUnit":
					profile.setQuotaUnit(siblingNodeValue);
					break;
				default:
					break;
				}
			}

			nextSibling = nextSibling.getNextSibling();
		}
	}
}
