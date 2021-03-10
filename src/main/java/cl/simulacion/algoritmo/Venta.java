package cl.simulacion.algoritmo;

public class Venta implements InterfaceVentas{

	private String comprador;
	
	private String fecha;
	
	protected int montoInicial;	
		
	
	public Venta() {
		
	}

	public Venta(String comprador, String fecha, int montoInicial) {
		super();
		this.comprador = comprador;
		this.fecha = fecha;
		this.montoInicial = montoInicial;
	}
	
	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getMontoInicial() {
		return montoInicial;
	}

	public void setMontoInicial(int montoInicial) {
		this.montoInicial = montoInicial;
	}

	@Override
	public int calcularMonto() {
		// TODO Auto-generated method stub
		return (int)(montoInicial*1.19);
	}

}
