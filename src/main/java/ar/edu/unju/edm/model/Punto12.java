package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
@Component
public class Punto12 {
	  int num;
	  double aux,g=9.81;
	  String resultado;
	  public void setNum(int num) {
	    this.num = num;
	  }
	  public int getNum() {
	    return num;
	  }
	  public String formula(){
	    aux=(Math.sqrt((2*num)/g));
	    resultado = String.valueOf(aux);
	    return resultado;
	  }
}
