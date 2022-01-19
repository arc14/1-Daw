package boletinUD04;

public class marcaCasa {

	public static void main(String[] args) {
		
		Integer [] a = creaArray(7);
		// a[0] = Integer.valueOf(3);
		
		try {
			poblarArray(a, 7);
			mostrarArray(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Integer[] creaArray (int largo) {
		
		return new Integer[largo];
	}
	
	public static void mostrarArray(Object[] arrayIn) {
		
		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println(arrayIn[i]);
		}
	}
	
	//si pasamos mas elementos de los que tiene un array salta la excepcion ya que no es posible, se saldrian del array.
	public static void poblarArray(Integer[] arr, int b) throws Exception{
		
		if (b > arr.length) {
			throw new Exception("Demasiados elementos para este array");
		}
		
		for (int i = 0; i < b; i++) {
			int ran = (int) (Math.random() * 12) + 1;
			
			arr[i] = Integer.valueOf(ran);
		}
	}
	
}
