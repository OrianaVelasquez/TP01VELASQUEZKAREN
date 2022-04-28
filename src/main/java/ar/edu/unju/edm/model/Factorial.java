package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Factorial {
	 private int n;
	 public Factorial (){
		 // TODO Auto-generated constructor stub
}

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}

	public int Fact() {
		var total = 1; 
		int i;
		for (i=1; i<=n; i++) {
			total = total * i; 
		}
		return total; 
	}

}
