package ar.edu.unju.edm.model;


import org.springframework.stereotype.Component;

@Component
public class Nota{
	
	private int N1;
	
	public Nota() {}
	
	public Nota(int N1) {
		
		this.N1=N1;
		
	}

	public int getNumero1() {
		return N1;
	}

	public void setNumero1(int N1) {
		this.N1 = N1;
	}
	
	
	public String Calificacion() {
		
		if (this.N1==6) {
			
			return "Alumno regulariza";
		}
		else if (this.N1>=7 && this.N1<=10) {
			
			return "El alumno promociona";
			
		}
		else if (this.N1<6 && this.N1>=1) {
			
			return "el alumno desaprueba";
		}
		
		else {
			return "Valor ingresado no permitido";
		}
			
			
		}	

	

}