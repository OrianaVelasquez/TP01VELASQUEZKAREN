package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto9 {
	
   private int num1;
   
   public Punto9() {
	   
	   
   }
   
   public Punto9(int num1) {
	   super();
	   this.num1=num1;
	   
   }

public int getNumero1() {
	return num1;
}

public void setNumero1(int num1) {
	this.num1 = num1;
}
   
   public String restante1() {
	   String resultadoString= "";
	   int resultadoInteger=1;
	   int restante=20;
	   this.num1=this.num1+20;
	   for (int i=1 ; i!=10 ; i++)   {
		   resultadoInteger=this.num1  - restante ;
		   this.num1=resultadoInteger;
		   resultadoString = resultadoString + Integer.toString(resultadoInteger) + " - ";
	   }
	   return resultadoString;
	   
	   
   } 
	   
   }