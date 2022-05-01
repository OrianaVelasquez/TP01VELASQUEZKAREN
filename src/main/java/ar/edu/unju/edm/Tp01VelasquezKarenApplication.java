package ar.edu.unju.edm;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.NumeroPar;
import ar.edu.unju.edm.model.Punto10;
import ar.edu.unju.edm.model.Punto11;
import ar.edu.unju.edm.model.Punto12;
import ar.edu.unju.edm.model.Punto9;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes1;
import ar.edu.unju.edm.model.Multiplos;

@SpringBootApplication
public class Tp01VelasquezKarenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01VelasquezKarenApplication.class, args);


		Factorial unFactorial= new Factorial ();
		unFactorial.setN(5);
		System.out.println("El resultado del Factorial es "+ unFactorial.Fact());
		
		NumeroPar miNumeroPar = new NumeroPar(13);
		System.out.println("Numero ingresado es"+" "+ miNumeroPar.numeroPar());

		  Mes1 nuevoMes = new Mes1();
		  nuevoMes.setMes(12);
		  System.out.println("El numero : " + nuevoMes.CalculoMes());
		  
		   Multiplos miPunto8 = new Multiplos(4);
			Punto9 miPunto9 = new Punto9(320);
			Punto10 miPunto10= new Punto10 (320);
			Punto11 miPunto11 = new Punto11(320);
			Punto12 miPunto12 = new Punto12(8);
			System.out.println("es: "+miPunto9.restante1());
			System.out.println("es: " +miPunto10.restante2());
			System.out.println("es: " + miPunto11.restante3());
			System.out.println("es: " + miPunto8.generarMultiplos1());
			System.out.println("es: " + miPunto12.calculoCaida());
	}
	
}
