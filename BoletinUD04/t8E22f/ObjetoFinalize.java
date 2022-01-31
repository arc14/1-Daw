package t8E22f;

import java.lang.*;

public class ObjetoFinalize {
	
	// No sé si es esto lo que se pide
	
	protected void finalize() throws Throwable {
		
		try {
			  
            System.out.println("dentro del metodo finalize()");
        }
        catch (Throwable e) {
  
            throw e;
        }
        finally {
  
        	System.out.println("Se va a borrar un objeto no referenciado");
  
            // Calling finalize() of Object class
            super.finalize();
        }
		
	}

	public static void main(String[] args) throws Throwable {
		
		new ObjetoFinalize().finalize();;

	}
	
	
}
