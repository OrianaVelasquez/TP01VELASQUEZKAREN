package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Multiplos {
		  int num;
		  String aux;
		  public void setNum(int num) {
		    this.num = num;
		  }
		  public int getNum() {
		    return num;
		  }
		  public String secu(){
		    String resultado="";
		    do {
		      num=num+4;
		      aux=String.valueOf(num);
		      resultado= resultado + " " + aux;
		    } while (num<100);
		    return resultado;
		  }
		}
