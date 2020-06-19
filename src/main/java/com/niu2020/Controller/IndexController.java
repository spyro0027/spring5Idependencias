package com.niu2020.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.niu2020.Models.Service.MiServicio;

@Controller
public class IndexController {
	@Autowired
	private MiServicio servicio;
	//siempre agregar la pleca par evitar errores de redireccion  1
@GetMapping({"/","","/index"})
public  String index(Model model) {
	model.addAttribute("objeto", servicio.operacion());
	return"index";
}

}
