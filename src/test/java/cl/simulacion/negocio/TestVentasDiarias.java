package cl.simulacion.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.simulacion.algoritmo.VentaDiaria;

public class TestVentasDiarias {

	@Test
	public void test() {
		
		VentaDiaria v1 = new VentaDiaria("A", "A1", 3000, 100);
		
		
	 
		assertEquals(3670, v1.calcularMonto());
	}

	
	@Test
	public void test2() {
		
		VentaDiaria v2 = new VentaDiaria("B", "B1", 2500, 500);
		
		
	 
		assertEquals(3475, v2.calcularMonto());
	}
}
