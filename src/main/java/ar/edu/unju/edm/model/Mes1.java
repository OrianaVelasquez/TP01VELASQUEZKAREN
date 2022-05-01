package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
 public class Mes1 {
	private int num;
 public Mes1() {
	//TODO Auto-generated constructor stub
 }
  public int getMes() {
	return num;
  }
  public void setMes(int num) {
	this.num = num;
  }
  public String CalculoMes() {
	
	if(this.num>0 && this.num<=12) {
		return "si es un mes del año";
	}
	else {
		return "no pertenece a un mes del año";
	}
  }
}