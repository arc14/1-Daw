package ejercJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

class TestCalc {

	@Test
	void testSuma() {
		//50% test positivo
		assertEquals(2, Calculadora.suma(1, 1)); //res positivo
		assertEquals(-6, Calculadora.suma(2, -8)); //res positivo
		assertEquals(10, Calculadora.suma(9, 0));
		assertEquals(2, Calculadora.suma(1, 5));
	}
	
	@Test
	void testResta() {
		//20%? test positivo
		assertEquals(9, Calculadora.resta(10, 1)); //res positivo
		assertEquals(-6, Calculadora.resta(10, 4));
		assertEquals(10, Calculadora.resta(100, 10));
		assertEquals(1, Calculadora.resta(2, 2));
	}
	
	@Test
	void testMulti() {
		//100% test positivo
		assertEquals(10, Calculadora.multi(10, 1));
		assertEquals(40, Calculadora.multi(10, 4));
		assertEquals(1000, Calculadora.multi(100, 10));
		assertEquals(1, Calculadora.multi(-1, -1));
	}
	
	@Test
	void testMulti4() {
		//100% test positivo
		assertEquals(16, Calculadora.superMult(2, 2, 2, 2));
		assertEquals(-40, Calculadora.superMult(10, 4, 1, -1));
		assertEquals(10000, Calculadora.superMult(10, 10, 10, 10));
		assertEquals(1, Calculadora.superMult(-1, -1, -1, -1));
	}

	@Test
	void testDiv() {
		//100% test positivo
		//el infinito da positivo?
		assertEquals(3.5, Calculadora.div(7, 2));
		assertEquals(2, Calculadora.div(10, 5));
		assertEquals(10, Calculadora.div(100, 10));
		assertEquals(Double.POSITIVE_INFINITY, Calculadora.div(5, 0));
	}
	
//	@RepeatedTest(5)                                    
//    @DisplayName("Ensure correct handling of zero")
//    void testMultiplyWithZero() {
//		double resultDiv = Calculadora.div(1, 0);
//		assertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(resultDiv));
//    }
	
	
}
