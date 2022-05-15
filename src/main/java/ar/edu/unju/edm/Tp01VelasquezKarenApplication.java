package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.NumeroPar;
import ar.edu.unju.edm.model.Mes1;
import ar.edu.unju.edm.model.Mes2;
import ar.edu.unju.edm.model.Nota;
import ar.edu.unju.edm.model.Multiplos;
import ar.edu.unju.edm.model.Punto9;
import ar.edu.unju.edm.model.Punto10;
import ar.edu.unju.edm.model.Punto11;
import ar.edu.unju.edm.model.Punto12;
@SpringBootApplication
public class Tp01VelasquezKarenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01VelasquezKarenApplication.class, args);

        //P1
		       Factorial unFactorial= new Factorial ();
		       unFactorial.setN(5);
		       System.out.println("El resultado del Factorial es "+ unFactorial.Fact());
		
		//P2
		       Bisiesto biBisiesto = new Bisiesto();
	           biBisiesto.setAnio(2020);
		       System.out.println("El año " + biBisiesto.CalculoBisiesto());
		//P3
		       NumeroPar miNumeroPar = new NumeroPar(13);
		        System.out.println("Numero ingresado es"+" "+ miNumeroPar.numeroPar());
        //Punto4
                Mes1 mmes = new Mes1();
		        mmes.setNum(13);;
	        	System.out.println(mmes.ME());
		//P5
	            Mes2 mmes2 = new Mes2();
	            mmes2.setN(2);
		        System.out.println(mmes2.ME());
		//punto6
				Nota nnota = new Nota();
				int aux=8;
				while(aux>0){
				nnota.setNu(aux);
				System.out.println(nnota.nota());
				aux--;
				}
        //Punto 7 no había que hacer
		//Punto 8
				Multiplos ssecuencia = new Multiplos();
				ssecuencia.setNum(4);
				System.out.println(ssecuencia.secu());
		//prueba punto9
				Punto9 ssecuencia2 = new Punto9();
				ssecuencia2.setNum(320);
				System.out.println(ssecuencia2.secuencia2());
		//prueba punto10
				Punto10 ssecuencia3 = new Punto10();
				ssecuencia3.setN(aux);;
				System.out.println(ssecuencia3.Secuencia());
		//prueba punto11
			    Punto11 ssecuencia4 = new Punto11();
				ssecuencia4.setNum(320);
				System.out.println(ssecuencia4.secu());
	   //prueba punto12
				Punto12 ttiempo = new Punto12();
				ttiempo.setNum(6);
				System.out.println(ttiempo.formula());
	}
}