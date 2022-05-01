package ar.edu.unju.edm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Multiplos;

public class Punto8Controller {
	@GetMapping("/calculoMultiplos")
	public ModelAndView getMultiplo1 (@RequestParam (name= "num1") String numero) {
		Multiplos multiplos = new Multiplos();
		multiplos.setNumero1(Integer.valueOf(numero));
		String resultadoMultiplos = new String();
		ModelAndView modelView = new ModelAndView("punto8");
		modelView.addObject("resultadoMultiplos",resultadoMultiplos);
		modelView.addObject("numero",numero);
		return modelView;
		
		
		
		
	}
}
