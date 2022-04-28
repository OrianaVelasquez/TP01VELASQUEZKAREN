package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.edu.unju.edm.model.Factorial;

@Controller 
public class Punto1Controller {
   @Autowired
   Factorial nuevoFactorial;
	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		return "index";
	}
	
	@GetMapping("/Factorial")
	public String getFactorialPage(@RequestParam (name = "n") int n , Model model) {
		int resultadoFac = 0;
		nuevoFactorial.setN(n);
		resultadoFac = nuevoFactorial.Fact();
		model.addAttribute("resultadoF", resultadoFac );
		return "resultadoF";
	}
	}