package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Mes2;
@Controller 

public class Punto5Controller {
	  @GetMapping("/Mes2")
	  public String getmes2Page(@RequestParam (name = "n") int num,Model model){
	    String aux;
	    Mes2 mmes2 = new Mes2();
	    mmes2.setN(num);
			aux = mmes2.ME();
	    model.addAttribute("mes2", aux);
	    return "Mes2";
	  }
}