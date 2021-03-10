package cl.simulacion.algoritmo;

import java.util.List;

public class VentaDiaria extends Venta{
	
	private int propina;
	
	public VentaDiaria() {
		 
	}
	 	
	
	
	public VentaDiaria(String comprador, String fecha, int montoInicial, int propina) {
		super(comprador, fecha, montoInicial);
		this.propina = propina;
		// TODO Auto-generated constructor stub
	}




	public int getPropina() {
		return propina;
	}
	public void setPropina(int propina) {
		this.propina = propina;
	}
	
	@Override
	public int calcularMonto() {
			
		
		return (int)(this.montoInicial*1.19 + this.propina);
	};
	
	
	public boolean conteoVentas10(VentaDiaria ventaD) {
	 
					
			if(this.propina >= (0.1*this.montoInicial)) {
				
				return true;
				
			}else {
				return false;
			}
		 		
	 
	}
	
}
