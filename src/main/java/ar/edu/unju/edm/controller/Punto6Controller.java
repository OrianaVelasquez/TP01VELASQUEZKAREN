package ar.edu.unju.edm.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Nota;

public class Punto6Controller {
	  @GetMapping("/nota")
	  public String getnotaPage(@RequestParam (name = "numero1") int numero1,Model model){
	    String[] Aux1= new String[8];
	    Nota nota = new Nota();
			for(int i=0;i<8;i++){
				nota.setNumero1(numero1);
				Aux1[i] = nota.Calificacion();
	      model.addAttribute("nota1", Aux1[0]);
	      model.addAttribute("nota2", Aux1[1]);
	      model.addAttribute("nota3", Aux1[2]);
	      model.addAttribute("nota4", Aux1[3]);
	      model.addAttribute("nota5", Aux1[4]);
	      model.addAttribute("nota6", Aux1[5]);
	      model.addAttribute("nota7", Aux1[6]);
	      model.addAttribute("nota8", Aux1[7]);
				numero1--;
			}
	    return "Nota6";
	  }
}
