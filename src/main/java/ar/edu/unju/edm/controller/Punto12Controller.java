package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto12;
@Controller
public class Punto12Controller {
	@GetMapping("/tiempo")
	  public String gettiempoPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    Punto12 tiem = new Punto12();
	    tiem.setNum(num);
	    aux = tiem.formula();
	    model.addAttribute("tiempo", aux);
	    return "Punto12";
	  }
}
