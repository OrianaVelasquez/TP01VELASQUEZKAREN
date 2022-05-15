package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.edu.unju.edm.model.Mes1;

@Controller 
public class Punto4Controller {

	  @GetMapping("/Mes1")
	  public String getmesPage(@RequestParam (name = "num") int n,Model model){
	    String aux;
	    Mes1 mmes = new Mes1();
	    mmes.setNum(n);
		aux = mmes.ME();
	    model.addAttribute("mes", aux);
	    return "Mes1";
	  }
}
	



