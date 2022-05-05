package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Mes2 {


private int number;
	
	
	public Mes2() {
		// TODO Auto-generated method stub

	}
	
	public Mes2(int number) {
		
		this.number=number;
	}

	public int getNumero1() {
		return number;
	}

	public void setNumero1(int number) {
		this.number = number;
	}
	
	public String CalculoMes2() {
		
		switch(this.number) {
		case 1: return "El dato ingresado es un mes";
		case 2: return "El dato ingresado es un mes";
		case 3: return "El dato ingresado es un mes";
		case 4: return "El dato ingresado es un mes";
		case 5: return "El dato ingresado es un mes";
		case 6: return "El dato ingresado es un mes";
		case 7: return "El dato ingresado es un mes";
		case 8: return "El dato ingresado es un mes";
		case 9: return "El dato ingresado es un mes";
		case 10: return "El dato ingresado es un mes";
		case 11: return "El dato ingresado es un mes";
		case 12: return "El dato ingresado es un mes";
		default:return"No pertenece a un mes";
		
		
		}
	}	

}
