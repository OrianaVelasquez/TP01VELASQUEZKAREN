package ar.edu.unju.edm.model;


import org.springframework.stereotype.Component;

@Component
public class Nota {
	  int nu;
	  public void setNu(int nu) {
	    this.nu = nu;
	  }
	  public int getNu() {
	    return nu;
	  }
	  public String nota(){
	    String resultado;
	    if(nu==6){
	      resultado="Alumno regulariza";
	    }else{
	      if(nu>=7 && nu<=10){
	        resultado="El alumno promociona";
	      }else{
	        if(nu<6 && nu>=1){
	          resultado ="El alumno desaprueba";
	        }else{
	            resultado="valor no permitido";
	        }
	      }
	    }
	    return resultado;
	  }

	}