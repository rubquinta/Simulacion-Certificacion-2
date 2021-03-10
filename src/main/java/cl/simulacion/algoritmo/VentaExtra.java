package cl.simulacion.algoritmo;

import java.util.List;

public class VentaExtra extends Venta{
	
	private int impuestoAdicional;
		
	public int getImpuestoAdicional() {
		return impuestoAdicional;
	}

	public void setImpuestoAdicional(int impuestoAdicional) {
		this.impuestoAdicional = impuestoAdicional;
	}
	
	
	public VentaExtra() {
	 
	}

	public VentaExtra(String comprador, String fecha, int montoInicial, int impuestoAdicional) {
		super(comprador, fecha, montoInicial);
		this.impuestoAdicional = impuestoAdicional;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularMonto() {
		return (int)(montoInicial  + (montoInicial*0.19+(impuestoAdicional)) );
	}
	
	public boolean conteoExtra( ) {
		
		 
		
		 
			if((19) > ((impuestoAdicional*100/this.montoInicial))) {
				
				return true;
							
			}else {
				return false;
			}
		 
		 
		
	}
	
	
}
