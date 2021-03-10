package cl.simulacion.negocio.modelo;

public class Factura {

	private int idfactura;
	private String cliente;
	private String fecha;
	private int subtotal;
	private int impuesto;
	private int total;
	
	public Factura() {
		
	}
	 
	

	public Factura(int idfactura, String cliente, String fecha, int subtotal, int impuesto, int total) {
		super();
		this.idfactura = idfactura;
		this.cliente = cliente;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.impuesto = impuesto;
		this.total = total;
	}



	public int getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	
	
	public int getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}


	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [idfactura=" + idfactura + ", cliente=" + cliente + ", fecha=" + fecha + ", subtotal="
				+ subtotal + ", total=" + total + "]";
	}
	
	
	
}
