package ar.edu.unju.edm.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Mes1;

public class Punto4Controller {
	@GetMapping("/Mes?")
	public String getmespage(@RequestParam (name ="num") int num, Model model) {
		String resultadoM;
		Mes1 nuevoMes=new Mes1();
		nuevoMes.setMes(num);
		resultadoM=nuevoMes.CalculoMes();
		model.addAttribute("resultadoM", resultadoM);
		return "Mes1";
	}
}






