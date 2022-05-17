package actLibroFinales10y11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ContactosAgenda {

	public static void main(String[] args) {

		// instancia del XML

		Document documento = null;

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			try {
				documento = builder.parse(new File("src/actLibroFinales10y11/agenda.xml"));
				documento.getDocumentElement().normalize();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// menu

		Scanner sc = new Scanner(System.in);

		int menu = 0;

		do {
			System.out.println("Menú");
			System.out.println("1. Nuevo contacto");
			System.out.println("2. Buscar por nombre");
			System.out.println("3. Mostrar todos");
			System.out.println("4. Salir");

			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				// añadir

				System.out.println("Dime el nombre");
				String name = sc.nextLine();
				System.out.println("Dime el telefono");
				Long tlfn = sc.nextLong();

				Element element = documento.getDocumentElement();

				element.setAttribute("Nombre", name);
				element.setAttribute("Telefono", Long.toString(tlfn));

				// element.insertBefore(newNode, null);

				// Transformer transformer = TransformerFactory.newInstance().newTransformer();
				// Source source = new DOMSource(documento);
				// Result result = new StreamResult(nombrexml+".xml");
				// transformer.transform(source, result);

				break;

			case 2:

				// listar por busqueda

				System.out.println("Termino de busqueda");
				String prefix = sc.nextLine();

				System.out.println("Listado:");

				NodeList listaContactos1 = documento.getElementsByTagName("contacto");
				for (int i = 0; i < listaContactos1.getLength(); i++) {
					// Cojo el nodo actual
					Node nodo = listaContactos1.item(i);
					// Compruebo si el nodo es un elemento
					if (nodo.getNodeType() == Node.ELEMENT_NODE) {
						// Lo transformo a Element
						Element e = (Element) nodo;
						// Obtengo sus hijos
						NodeList hijos = e.getChildNodes();
						// Recorro sus hijos
						for (int j = 0; j < hijos.getLength(); j++) {
							// Obtengo al hijo actual
							Node hijo = hijos.item(j);
							// Compruebo si es un nodo
							if (hijo.getNodeType() == Node.ELEMENT_NODE) {
								// Muestro el contenido
								
								if (hijo.getTextContent().toLowerCase().startsWith(prefix)) {
									
								}
								
								if((hijo.getNodeName().equals("nombre")))
									System.out.println("Propiedad: " + hijo.getNodeName() + ", Valor: " + hijo.getTextContent());
								else if(hijo.getNodeName().equals("telefono")&&(hijos.item(j).getTextContent().toLowerCase().startsWith(prefix))) {
									System.out.println("Propiedad: " + hijo.getNodeName() + ", Valor: " + hijo.getTextContent());

								}
									
							}

						}
						System.out.println("");
					}

				}

				System.out.println("");

				break;

			case 3:

				// listar todos los contactos

				System.out.println("Listado:");

				NodeList listaContactos = documento.getElementsByTagName("contacto");
				for (int i = 0; i < listaContactos.getLength(); i++) {
					// Cojo el nodo actual
					Node nodo = listaContactos.item(i);
					// Compruebo si el nodo es un elemento
					if (nodo.getNodeType() == Node.ELEMENT_NODE) {
						// Lo transformo a Element
						Element e = (Element) nodo;
						// Obtengo sus hijos
						NodeList hijos = e.getChildNodes();
						// Recorro sus hijos
						for (int j = 0; j < hijos.getLength(); j++) {
							// Obtengo al hijo actual
							Node hijo = hijos.item(j);
							// Compruebo si es un nodo
							if (hijo.getNodeType() == Node.ELEMENT_NODE) {
								// Muestro el contenido
								System.out.println(
										"Propiedad: " + hijo.getNodeName() + ", Valor: " + hijo.getTextContent());
							}

						}
						System.out.println("");
					}

				}

				System.out.println("");

				break;

			case 4:
				continue;

			default:
				break;

			}

		} while (menu != 4);

		sc.close();

	}
}
