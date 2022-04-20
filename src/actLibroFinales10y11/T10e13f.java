package actLibroFinales10y11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T10e13f {

	public static void main(String[] args) {

		// crear archivo con comprobador de que existe.
		try {
			File archivoFinal = new File("src/actLibroFinales10y11/ficheroFinal.txt");
			if (archivoFinal.createNewFile()) {
				System.out.println("Archivo creado: " + archivoFinal.getName());
			} else {
				System.out.println("Archivo ya existe.");
			}
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}

		// leer primer fichero y guardar en un arraylist

		FileInputStream a = null;

		try {
			a = new FileInputStream("src/actLibroFinales10y11/fich1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Scanner sf = new Scanner(a);

		ArrayList<Integer> array1 = new ArrayList<>();

		while (sf.hasNext()) {
			array1.add(sf.nextInt());
		}

		// leer segundo fichero y arraylist

		FileInputStream b = null;

		try {
			b = new FileInputStream("src/actLibroFinales10y11/fich2");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Scanner sb = new Scanner(b);

		ArrayList<Integer> array2 = new ArrayList<>();

		while (sb.hasNext()) {
			array2.add(sb.nextInt());
		}

		//añadir ambos arrays a un arrayfinal
		
		ArrayList<Integer> arrayFinal = new ArrayList<>();
		
		arrayFinal.addAll(array1);
		arrayFinal.addAll(array2);
		
		//ordenar
		
		Collections.sort(arrayFinal);
		
		//crear buffer de escritura
		
		BufferedWriter bff = null;
		
		try {
			bff = new BufferedWriter(new FileWriter("src/actLibroFinales10y11/ficheroFinal.txt"));
			
			//añadir cada indice del arrayFinal a cada linea del fichero
			for (int i = 0; i < arrayFinal.size(); i++) {
							
				bff.write(arrayFinal.get(i).toString());
				bff.newLine();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sf.close();
		sb.close();
		
		
	}

}
