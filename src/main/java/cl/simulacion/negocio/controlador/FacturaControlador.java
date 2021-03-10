package cl.simulacion.negocio.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.simulacion.negocio.dao.DetallefacturaDao;
import cl.simulacion.negocio.dao.FacturaDao;
import cl.simulacion.negocio.dao.IFacturaDao;
import cl.simulacion.negocio.modelo.Detallefactura;
import cl.simulacion.negocio.modelo.Factura;

@Controller
public class FacturaControlador {

	 @Autowired
	 IFacturaDao fd;
	 
	 @Autowired 
	DetallefacturaDao dfd;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String verinicio() {
		
		return"vistainicio";
	}
 
	
	@RequestMapping(value="/detallefactura", method=RequestMethod.POST)
	public String verdetalle(Model model, @RequestParam("facturaid") int facturaid) {
				
		Factura datosfactura = fd.obtenerFacturaPorId(facturaid);
		
		List<Detallefactura> ldetallefactura = dfd.obtenerDetallePorId(facturaid);
		
		model.addAttribute("datfact", datosfactura);
		model.addAttribute("ldetfact",ldetallefactura);
		
		return"vistadetalle";
	}
}
