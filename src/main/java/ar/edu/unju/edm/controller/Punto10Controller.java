package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto10;

public class Punto10Controller {
	@Autowired
	Punto10 punto10;
	@GetMapping("/calculoRestante2")
	public ModelAndView getRestante2 (@RequestParam (name= "num1") String numero) {
		punto10.setNumero1(Integer.valueOf(numero));
		String resultadoRestante2=punto10.restante2();
		ModelAndView modelView = new ModelAndView("punto10");
		modelView.addObject("resultado10",resultadoRestante2);
		modelView.addObject("numero",numero);
		return modelView;
		
	}
}
