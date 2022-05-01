package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto9;

public class Punto9Controller {
	@Autowired
	Punto9 punto9;
	@GetMapping("/calculoRestante1")
	public ModelAndView getRestante1 (@RequestParam (name= "num1") String numero) {
		punto9.setNumero1(Integer.valueOf(numero));
		String resultadoRestante1=punto9.restante1();
		ModelAndView modelView = new ModelAndView("punto9");
		modelView.addObject("resultado9",resultadoRestante1);
		modelView.addObject("numero",numero);
		return modelView;
		
	}
}
