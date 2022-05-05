package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto11;

public class Punto11Controller {
	@Autowired
	Punto11 punto11;
	@GetMapping("/calculoRestante3")
	public ModelAndView getRestante3 (@RequestParam (name= "numero1") String numero1) {
		punto11.setNumero1(Integer.valueOf(numero1));
		String resultadoRestante3=punto11.restante3();
		ModelAndView modelView = new ModelAndView("punto11");
		modelView.addObject("Punto11",resultadoRestante3);
		modelView.addObject("numero1",numero1);
		return modelView;
		
	}
	
}
