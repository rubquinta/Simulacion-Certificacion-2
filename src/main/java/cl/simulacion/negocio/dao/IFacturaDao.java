package cl.simulacion.negocio.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

 import cl.simulacion.negocio.modelo.Factura;

public interface IFacturaDao {
	
	public Factura obtenerFacturaPorId(int idfactura);

}

