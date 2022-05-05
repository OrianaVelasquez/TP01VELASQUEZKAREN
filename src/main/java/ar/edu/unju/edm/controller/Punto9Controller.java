package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto9;

public class Punto9Controller {
	@Autowired
	Punto9 Punto9;
	@GetMapping("/calculoRestante1")
	public ModelAndView getRestante1 (@RequestParam (name= "num1") String num1) {
		Punto9.setNumero1(Integer.valueOf(num1));
		String resultadoRestante1=Punto9.restante1();
		ModelAndView modelView = new ModelAndView("punto9");
		modelView.addObject("Punto9",resultadoRestante1);
		modelView.addObject("numero",num1);
		return modelView;
		
	}
}
