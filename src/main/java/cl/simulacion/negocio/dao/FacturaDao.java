package cl.simulacion.negocio.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

 
import cl.simulacion.negocio.modelo.Factura;

public class FacturaDao implements IFacturaDao{

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
 
	
	@Override
	public Factura obtenerFacturaPorId(int idfactura) {
		String sql = " select f.facturaid, f.cliente, to_char(f.fecha, 'DD-MM-YYYY') as fecha, \r\n"
				+ "sum(cantidad*valor) as SubTotal,\r\n"
				+ "cast(sum(cantidad*valor*.19) as int) as Impuesto,\r\n"
				+ "cast(sum(cantidad*valor*1.19) as int) as Total from factura F\r\n"
				+ "left join detallefactura DF\r\n"
				+ "on f.facturaid= df.factura_facturaid\r\n"
				+ "left join producto p\r\n"
				+ "on df.producto_productoid=p.productoid\r\n"
				+ "where facturaid = ?\r\n"
				+ "group by f.facturaid, f.cliente, to_char(f.fecha, 'DD-MM-YYYY')\r\n"
				+ "order by facturaid";

		
		return template.queryForObject(sql, new Object[]{idfactura}, (rs, rowNum) ->
				new Factura(
						rs.getInt("facturaid"),
						rs.getString("cliente"),
						rs.getString("fecha"),
						rs.getInt("subtotal"),
						rs.getInt("impuesto"),
						rs.getInt("total")
						));
	}

}

 