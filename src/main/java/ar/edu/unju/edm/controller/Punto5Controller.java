package ar.edu.unju.edm.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Mes2;

public class Punto5Controller {
	@GetMapping("/calculoMes2")
    public String getMes2(@RequestParam(name="numero1")int numero1,Model model) {
		String resultadoM2;
		Mes2 nuevoMes2=new Mes2();
		nuevoMes2.setNumero1(numero1);
    	resultadoM2=nuevoMes2.CalculoMes2();
    	model.addAttribute("resultadoM2", resultadoM2);
		return "Mes2";
   
	}
}
