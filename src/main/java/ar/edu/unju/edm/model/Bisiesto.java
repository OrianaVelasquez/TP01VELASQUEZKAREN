package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Bisiesto {
	 private int anio;

	 public Bisiesto(){
		 // TODO Auto-generated constructor stub
}
     public Bisiesto (int anio) {
    	 super ();
    	 this.anio=anio;
     }
     public int getAnio() {
    	 return anio;
     }
     public void setAnio (int anio) {
    	 this.anio=anio;
     }
     public String CalculoBisiesto() {
    	 String bisiesto;
    	 if((this.anio % 4 ==0)&& (this.anio % 100 !=0 || this.anio % 400 == 0)) {
    		 bisiesto= "es año bisiesto";
    	 }else {
    		 bisiesto= "no es año bisiesto";
    	 }
    	 return bisiesto;
 }}