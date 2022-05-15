package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto10;
@Controller
public class Punto10Controller {
	 @GetMapping("/Secuencia3")
	  public String getsecu4Page(@RequestParam (name = "n") int num,Model model){
	    String Aux;
	    Punto10 secu3 = new Punto10();
	    secu3.setN(num);
	    Aux = secu3.Secuencia();
	    model.addAttribute("secu3", Aux);
	    return "Punto10";
	  }
}
