package cl.desafiolatam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mensaje")
public class MensajeController {
	private static final Logger logger = LoggerFactory.getLogger(MensajeController.class);
	
	@RequestMapping(value = {"/", ""})
	public String index() {
		return "mensaje/vista-mensaje";
	}
}
