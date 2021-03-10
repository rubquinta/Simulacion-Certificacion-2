package cl.simulacion.algoritmo;

import java.util.ArrayList;
import java.util.List;
import cl.simulacion.algoritmo.*;

public class Democonsola {

	public static void main(String[] args) {
		
		VentaDiaria venta0 = new VentaDiaria("A", "A1", 3000, 100);
		VentaDiaria venta1 = new VentaDiaria("B", "B1", 2500, 500);
		VentaDiaria venta2 = new VentaDiaria("C", "C1", 10000, 1000);
		VentaDiaria venta3 = new VentaDiaria("D", "D1", 7640, 400);
		
		List<VentaDiaria> listaVentasDiarias = new ArrayList<VentaDiaria>();
		
		listaVentasDiarias.add(venta0);
		listaVentasDiarias.add(venta1);
		listaVentasDiarias.add(venta2);
		listaVentasDiarias.add(venta3);
		
		int montoSumaTotal = 0;
		
		int contProp = 0;
		
		
		for(int i = 0; i < listaVentasDiarias.size(); i++) {
			
			montoSumaTotal += listaVentasDiarias.get(i).calcularMonto();
			
			System.out.println("Venta diaria " + (i+1) + " Inicial: " + 
					listaVentasDiarias.get(i).getMontoInicial() +
					" propina: " + listaVentasDiarias.get(i).getPropina() +
					" total: " + listaVentasDiarias.get(i).calcularMonto() + "\n");
			
			if(listaVentasDiarias.get(i).getPropina() >= (listaVentasDiarias.get(i).getMontoInicial()*0.1)) {
				
				contProp++;
			}
			
			
			
		}
		
		
		VentaExtra ventaE0 = new VentaExtra("A", "A1", 5000, 1190);
		VentaExtra ventaE1 = new VentaExtra("B", "B1", 15000, 1785);
		VentaExtra ventaE2 = new VentaExtra("C", "C1", 3480, 1242);
		VentaExtra ventaE3 = new VentaExtra("D", "D1", 20000, 9520);
		
		List<VentaExtra> listaVentasExtras = new ArrayList<VentaExtra>();
		
		listaVentasExtras.add(ventaE0);
		listaVentasExtras.add(ventaE1);
		listaVentasExtras.add(ventaE2);
		listaVentasExtras.add(ventaE3);
		
		int montoTotalExtras = 0;
		
		int conteoVentasExtra = 0; 
		
		for(int i = 0; i < listaVentasExtras.size(); i++){
			
			montoTotalExtras += listaVentasExtras.get(i).calcularMonto();
			
			System.out.println("Venta extra " + (i+1) + ": Inicial " + 
			listaVentasExtras.get(i).getMontoInicial() + ", impuesto adicional " +
			(listaVentasExtras.get(i).getImpuestoAdicional()) + ", total: " +
			listaVentasExtras.get(i).calcularMonto() + "\n");
			
			if(listaVentasExtras.get(i).conteoExtra()) {
				
				conteoVentasExtra++;
				
			}
					
			
			
		}
		
 
		System.out.println("Monto total ventas diarias: " + montoSumaTotal + "\n");
		System.out.println("Monto total ventas extras: " + montoTotalExtras + "\n");
		System.out.println("Monto total: " + (montoTotalExtras+montoSumaTotal) + "\n");
		System.out.println("Ventas diarias con propina igual o superior al 10% de"
				+ " monto inicial: " + contProp + "\n");
		System.out.println("Ventas extras con porcentaje impuesto fijo (19%)"
				+ " mayor a impuesto adicional de venta: " + conteoVentasExtra );
		
		
		
		
		
		
		
		
	}

}
