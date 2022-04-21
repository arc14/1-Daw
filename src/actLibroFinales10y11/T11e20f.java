package actLibroFinales10y11;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class T11e20f {

	public static void main(String[] args) {

		// Fichero binario se refiere a gestionar con un array los datos y al final
		// guardarlo

		ArrayList<Cliente> arrayCliente = new ArrayList<>();

		// Creamos un flujo de salida a null (grabar)

		ObjectOutputStream flujoOut = null;
		try {
			flujoOut = new ObjectOutputStream(new FileOutputStream("clientes.dat"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Creamos un flujo de entrada y lo envolvemos en un object (leer del archivo)

		ObjectInputStream flujoIn = null;

		try {
			flujoIn = new ObjectInputStream(new FileInputStream("clientes.dat"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// creando el menu del programa
		Scanner sc = new Scanner(System.in);

		int menu = 0;

		do {

			System.out.println("1. Añadir nuevo cliente");
			System.out.println("2. Modificar datos");
			System.out.println("3. Dar de baja cliente");
			System.out.println("4. Listar los clientes");
			System.out.println("5. Salir del programa");

			menu = sc.nextInt();

			switch (menu) {
			case 1: // añadir cliente

				System.out.println("Dime el id");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Dime el nombre");
				String nombre = sc.nextLine();

				System.out.println("Dime el telefono");
				long tlfn = sc.nextLong();

				Cliente clie = new Cliente(id, nombre, tlfn);

				arrayCliente.add(clie);

				// encapsulamos el archivo a grabar como objeto

				break;

			case 2: // modificar

				mostrarArray(arrayCliente);

				System.out.println("Que cliente quiere modificar? (introduce el ID)");

				int modId = sc.nextInt();

				try {
					System.out.println("Dime el nuevo id");
					int idMod = sc.nextInt();
					sc.nextLine();

					System.out.println("Dime el nuevo nombre");
					String nombreMod = sc.nextLine();

					System.out.println("Dime el nuevo telefono");
					long tlfnMod = sc.nextLong();

					Cliente clieMod = new Cliente(idMod, nombreMod, tlfnMod);

					// obtener el index del array del ID que pongamos

					arrayCliente.set(getIndex(arrayCliente, modId), clieMod);

				} catch (Exception e) {
					System.out.println("Linea de cliente no valida");
				}

				break;

			case 3: // eliminar

				mostrarArray(arrayCliente);

				System.out.println("Que cliente quiere eliminar? (introduce el ID)");

				int removeId = sc.nextInt();

				try {
					
					// con el metodo buscamos el index del id dado
					arrayCliente.remove(getIndex(arrayCliente, removeId));

				} catch (Exception e) {
					System.out.println("Linea de cliente no valida");
				}

			case 4: // ver lista

				mostrarArray(arrayCliente);

				break;

			case 5:

				break;

			default:

				System.out.println("Opcion no valida");

				break;
			}

		} while (menu != 5);

		// metodos finales
		mostrarFichero(flujoIn);

		grabarEnFichero(flujoOut, arrayCliente);

		System.out.println("--- Programa acabado ---");

		sc.close();		
		
	}

	// obtener el index del array del ID que pongamos
	
	private static int getIndex(ArrayList<Cliente> list, int id) {

		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getId() == id)
				return i;
		return -1;

	}

	private static void mostrarArray(Collection<Cliente> arrayCliente) {

		for (Cliente cliente : arrayCliente) {
			System.out.println(cliente.toString());
		}

		System.out.println();
	}

	private static void mostrarFichero(ObjectInputStream flujoIn) {

		System.out.println("Tabla en el fichero:");

		try {

			while (true) {
				System.out.println(flujoIn.readObject());
			}

		} catch (EOFException ex) {
			System.out.println("Fin de fichero");
			System.out.println();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void grabarEnFichero(ObjectOutputStream flujoOut, Collection<Cliente> arrayCliente) {
		try {

			for (Cliente cliente : arrayCliente) {
				flujoOut.writeObject(cliente);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Datos grabados en fichero");
	}
	
}
