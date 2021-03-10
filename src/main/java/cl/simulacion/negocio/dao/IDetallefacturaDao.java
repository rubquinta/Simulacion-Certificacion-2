package cl.simulacion.negocio.dao;

import java.util.List;

import cl.simulacion.negocio.modelo.Detallefactura;

public interface IDetallefacturaDao {
	
	public List<Detallefactura> obtenerDetallePorId(int idfactura);

}
