package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto10 {
	
	  int n;
	  String aux;
	  
	  public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String Secuencia(){
	    String resultado="";
	    while(n>=160){
	      aux=String.valueOf(n);
	      resultado= resultado + " " + aux;
	      n=n-20;
	    }
	    return resultado;
	  }
   }
	   
	   