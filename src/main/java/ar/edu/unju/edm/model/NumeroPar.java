package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class NumeroPar {
	public NumeroPar(){
		 // TODO Auto-generated constructor stub
}
	private int numero1;
	
	public NumeroPar(int numero1) {
		
		this.numero1=numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public String numeroPar() {
		
		if(this.numero1%2==0) {
			
			return "Es par";
		}
		else {
			return "No es par";
		}
		
		
	}

}

