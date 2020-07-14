package cl.desafiolatam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.desafiolatam.entidad.Mensaje;
import cl.desafiolatam.service.IMensajeService;
import cl.desafiolatam.service.MensajeServiceImpl;

@Controller
@RequestMapping("/mensaje")
public class MensajeController {
	private static final Logger logger = LoggerFactory.getLogger(MensajeController.class);
	
	private IMensajeService servicio;
	
	public MensajeController() {
	servicio = new MensajeServiceImpl();
	}
	
	@RequestMapping(value = {"/", ""})
	public String index(ModelMap modelo) {
		logger.info("Ejecutada vista del mensaje, desde controller");
		modelo.put("mensajes", servicio.obtenerTodos());
		return "mensaje/vista-mensaje";
	}
	@RequestMapping(value = "/ingresar", method = RequestMethod.POST)
	public String ingresar(
			ModelMap modelo,
			@ModelAttribute("mensaje") Mensaje mensaje)
	{		
		servicio.agregarMensaje(mensaje);
		modelo.put("mensajes", servicio.obtenerTodos());
				
		return "mensaje/vista-mensaje";
	}
	
	@RequestMapping(value = "/eliminar", method = RequestMethod.GET)
	public String eliminar(
			ModelMap modelo,
			@RequestParam(name = "id", required = true) int id
		){		
		servicio.eliminar(id);
		modelo.put("mensajes", servicio.obtenerTodos());
				
		return "mensaje/vista-mensaje";
	}
}
