package actLibroFinales10y11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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

		NodeList hijos = obtenerHijo(documento);
		
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
				//añadir
				
				System.out.println("Dime el nombre");
				String name = sc.nextLine();
				System.out.println("Dime el telefono");
				Long tlfn = sc.nextLong();
				
				Node newNode = (Node) obtenerHijo(documento);
				
				Element element = documento.getDocumentElement();
				
				element.setAttribute("Nombre", name);
				element.setAttribute("Telefono", Long.toString(tlfn));
				
				element.insertBefore(newNode, null);
				
				
				
				
				break;

			case 2:
				
				//listar por busqueda
				
				System.out.println("¿Terminos de la busqueda? :");
				String prefix = sc.nextLine().toLowerCase();
				
				for (int j = 0; j < hijos.getLength(); j++) {
					Node hijo = hijos.item(j);
					if (hijo.getNodeType() == Node.ELEMENT_NODE) {
						if (hijo.getNodeName().equals("nombre") && hijo.getTextContent().toLowerCase().startsWith(prefix)) {
							System.out.print(hijo.getNodeName() + ": " + hijo.getTextContent() + "  ");
						}
						
					}

				}
				System.out.println("");
				System.out.println("");
				
				
				break;

			case 3:
				
				//listar todos los contactos
				
				System.out.println("Listado:");

				// Recorro sus hijos
				for (int j = 0; j < hijos.getLength(); j++) {
					// Obtengo al hijo actual
					Node hijo = hijos.item(j);
					// Compruebo si es un nodo
					if (hijo.getNodeType() == Node.ELEMENT_NODE) {
						// Muestro el contenido
						System.out.print(hijo.getNodeName() + ": " + hijo.getTextContent() + "  ");
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

	private static NodeList obtenerHijo(Document doc) {
		NodeList listaContactos = ((org.w3c.dom.Document) doc).getElementsByTagName("contacto");

		for (int i = 0; i < listaContactos.getLength(); i++) {
			Node nodo = listaContactos.item(i);
			// Compruebo si el nodo es un elemento
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {
				// Lo transformo a Element
				Element e = (Element) nodo;
				// Obtengo sus hijos
				return e.getChildNodes();
			}

		}
		return null;
	}

}
