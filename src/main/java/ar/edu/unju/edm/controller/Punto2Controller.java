package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Bisiesto;
@Controller 
public class Punto2Controller {

	@Autowired
	Bisiesto nuevoBisiesto;
	@GetMapping("/Bisiesto")
	public String getBisiestoPage(@RequestParam (name = "anio") int anio , Model model) {
		String resultadobi;
		nuevoBisiesto.setAnio(anio);
		resultadobi = nuevoBisiesto.CalculoBisiesto();
		model.addAttribute("anio", anio); //lo que va entre comillas es de html
		model.addAttribute("bisiesto", resultadobi);
		return "bisiesto";
		
}}