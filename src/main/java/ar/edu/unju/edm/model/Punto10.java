package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto10 {
	
   private int number;
   
   public Punto10() {
	   
	   
   }
   
   public Punto10(int number) {
	   super();
	   this.number=number;
	   
   }

public int getNumero1() {
	return number;
}

public void setNumero1(int number) {
	this.number = number;
}
   
   public String restante2() {
	   String resultadoString= "";
	   int resultadoInteger=1;
	   int restante=20;
	   this.number=this.number+20;
	   while (this.number!=160) {
		   resultadoInteger=this.number - restante ;
		   this.number=resultadoInteger;
		   resultadoString = resultadoString + Integer.toString(resultadoInteger) + " - ";
	   }
	   return resultadoString;
	   
	   
   } 
	   
   }
	   
	   