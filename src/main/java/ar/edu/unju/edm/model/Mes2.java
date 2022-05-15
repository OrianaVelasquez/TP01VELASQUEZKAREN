package ar.edu.unju.edm.model;
public class Mes2 {
  int n;
  public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}

  public String ME(){
    String aux;
    switch(n){
      case 1:
      aux="Enero";
      break;
      case 2:
      aux="Febrero";
      break;
      case 3:
      aux="Marzo";
      break;
      case 4:
      aux="Abril";
      break;
      case 5:
      aux="Mayo";
      break;
      case 6:
      aux="Junio";
      break;
      case 7:
      aux="Julio";
      break;
      case 8:
      aux="Agosto";
      break;
      case 9:
      aux="Septiembre";
      break;
      case 10:
      aux="Octubre";
      break;
      case 11:
      aux="Noviembre";
      break;
      case 12:
      aux="Diciembre";
      break;
      default:
      aux="No existe ese mes";
      break;
    }                  
    return aux;
  }
}
