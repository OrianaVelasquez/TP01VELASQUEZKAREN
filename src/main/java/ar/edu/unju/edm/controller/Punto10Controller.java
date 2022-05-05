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
	public ModelAndView getRestante2 (@RequestParam (name= "number") String number) {
		punto10.setNumero1(Integer.valueOf(number));
		String resultadoRestante2=punto10.restante2();
		ModelAndView modelView = new ModelAndView("punto10");
		modelView.addObject("Punto10",resultadoRestante2);
		modelView.addObject("number",number);
		return modelView;
		
	}
}
