package cl.simulacion.negocio.dao;

 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.simulacion.negocio.modelo.Detallefactura;
import cl.simulacion.negocio.modelo.Factura;
 

public class DetallefacturaDao implements IDetallefacturaDao{

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<Detallefactura> obtenerDetallePorId(int idfactura) {
		 
		String query = "select rownum as iddetalle, \r\n"
				+ "df.factura_facturaid as idfactura, \r\n"
				+ "df.producto_productoid as idproducto ,\r\n"
				+ "p.nombre,\r\n"
				+ "p.valor,\r\n"
				+ "df.cantidad from detallefactura df\r\n"
				+ "left join producto p on df.producto_productoid = p.productoid\r\n"
				+ "where df.factura_facturaid= " + idfactura +"\r\n"
				+ "order by p.nombre";
		
		return template.query(query, new RowMapper<Detallefactura>() {
			public Detallefactura mapRow(ResultSet rs, int row) throws SQLException{
				Detallefactura df = new Detallefactura();
				df.setIddetalle(rs.getInt(1));
				df.setIdfactura(rs.getInt(2));
				df.setIdproducto(rs.getInt(3));
				df.setNombreproducto(rs.getString(4));
				df.setPrecio(rs.getInt(5));
				df.setCantidad(rs.getInt(6));
				return df;	
			}
			});
	}

}

 
