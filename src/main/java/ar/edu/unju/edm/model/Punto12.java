package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
@Component
public class Punto12 {
	private int numero;
	public Punto12() {
		// TODO Auto-generated constructor stub
	}
	public Punto12(int numero) {
		super();
		this.numero = numero;
	}
	public int getNumero1() {
		return numero;
	}
	public void setNumero1(int numero) {
		this.numero = numero;
	}
	
	public String calculoCaida() {
		String resultadoString = "";
		double resultadoInteger;
		double g=9.8;
		if (this.numero>0) {
			resultadoInteger= Math.sqrt((2*this.numero)/g);
			resultadoString=resultadoString + Double.toString(resultadoInteger);
			return resultadoString;
		}
		else {
			return "El numero ingresado tiene que ser mayor a 0";
			
		}
		
		
		
		
	}
	

}
