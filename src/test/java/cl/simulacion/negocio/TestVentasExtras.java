package cl.simulacion.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.simulacion.algoritmo.VentaExtra;

public class TestVentasExtras {

	@Test
	public void test() {
		
		VentaExtra ventaE0 = new VentaExtra("A", "A1", 5000, 1190);
		
		assertEquals( 7140, ventaE0.calcularMonto());
	}
	
	@Test
	public void test2() {
		
		VentaExtra ventaE1 = new VentaExtra("B", "B1", 15000, 1785);
		
		assertEquals( 19635, ventaE1.calcularMonto());
	}

}
