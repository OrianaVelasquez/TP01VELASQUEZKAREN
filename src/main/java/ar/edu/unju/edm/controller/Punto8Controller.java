package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.edu.unju.edm.model.Multiplos;

@Controller
     public class Punto8Controller {
	 @GetMapping("/Multiplos")
	  public String getsecu2Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Multiplos secu2 = new Multiplos();
	    secu2.setNum(num);
	    Aux = secu2.secu();
	    model.addAttribute("secu2", Aux);
	    return "Multiplos";
	  }
}
