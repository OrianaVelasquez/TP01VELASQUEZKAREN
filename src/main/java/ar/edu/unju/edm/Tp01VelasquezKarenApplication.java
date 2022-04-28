package ar.edu.unju.edm;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Factorial;

@SpringBootApplication
public class Tp01VelasquezKarenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01VelasquezKarenApplication.class, args);


		Factorial unFactorial= new Factorial ();
		unFactorial.setN(5);
		System.out.println("El resultado del Factorial es "+ unFactorial.Fact());
	    

	}
	
}
