package actLibroFinales12;

import java.util.ArrayList;
import java.util.Collection;

public class supercola {
		
	private static ArrayList<Integer> cola1 = new ArrayList<Integer>();
	private static ArrayList<Integer> cola2 = new ArrayList<Integer>();
	

	protected static ArrayList<Integer> cola1(){
		return cola1;
		
	}

	protected static ArrayList<Integer> cola2(){
		return cola2;
		
	}

	protected static void encolar(int a, Collection<Integer> b) {
		b.add(a);
	}
	
	protected static void desencolar(ArrayList<Integer> a, int checkList)  {
		
		try {
			if(checkList == 1 && a.isEmpty()) {
				cola2.remove(0);
				
			} else if(checkList == 2 && a.isEmpty()) {
				cola1.remove(0);
				
			} else if(checkList == 1 && !a.isEmpty()) {
				cola1.remove(0);
				
			} else if(checkList == 2 && !a.isEmpty()) {
				cola2.remove(0);
			}
		} catch (Exception e) {
			System.out.println("Ambas listas estan vacias");
		}
		
		
		
	}


}