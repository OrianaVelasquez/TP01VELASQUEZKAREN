package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.NumeroPar;
@Controller 
public class Punto3Controller {

	@Autowired
	NumeroPar nuevoPar;
	@GetMapping("/Par")
	public String getParPage(@RequestParam (name = "n1") int n1 , Model model) {
		String resultadopar;
		nuevoPar.setNum1(n1);
		resultadopar = nuevoPar.CalculoPar();
		model.addAttribute("n1", n1); //lo que va entre comillas es de html
		model.addAttribute("Par", resultadopar);
		return "par";
		
}}