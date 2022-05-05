package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto12;

public class Punto12Controller {
	@Autowired
	Punto12 punto12;
	@GetMapping("/calculoPunto12")
	public ModelAndView getPunto12 (@RequestParam (name= "numero") String numero) {
		punto12.setNumero1(Integer.valueOf(numero));
		String resultadoPunto12=punto12.calculoCaida();
		ModelAndView modelView = new ModelAndView("punto12");
		modelView.addObject("Punto12",resultadoPunto12);
		modelView.addObject("numero",numero);
		return modelView;
		
	}
}
