package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto11;
@Controller
public class Punto11Controller {
	@GetMapping("/secuencia4")
	  public String getsecu5Page(@RequestParam (name = "num") int num, Model model){
	    String Aux;
	    Punto11 secu4 = new Punto11();
	    secu4.setNum(num);
	    Aux = secu4.secu();
	    model.addAttribute("secu4", Aux);
	    return "Punto11";
	  }
}
