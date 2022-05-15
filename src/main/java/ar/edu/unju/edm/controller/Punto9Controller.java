package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto9;
@Controller
public class Punto9Controller {
	@GetMapping("/secuencia2")
	  public String getsecu3Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Punto9 secu2 = new Punto9();
	    secu2.setNum(num);
	    Aux = secu2.secuencia2();
	    model.addAttribute("secu2", Aux);
	    return "Punto9";
	  }
}
