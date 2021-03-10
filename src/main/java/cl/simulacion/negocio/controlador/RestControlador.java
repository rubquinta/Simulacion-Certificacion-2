package cl.simulacion.negocio.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.simulacion.negocio.dao.DetallefacturaDao;
import cl.simulacion.negocio.modelo.Detallefactura;

@RestController
public class RestControlador {
	
	@Autowired
	DetallefacturaDao dfd;
	
	@RequestMapping(value="/verdetalle/{id}", method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Detallefactura> obtenerDetalleFactura(@PathVariable("id") int idfactura){
		
		List<Detallefactura> listadetfactura = dfd.obtenerDetallePorId(idfactura);
		
		return listadetfactura;
	}

}
