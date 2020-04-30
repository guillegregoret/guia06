package died.guia06;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Curso c1 = new Curso(1,"AMI",2017,3,20,0);
		ArrayList<Curso> aprobados  = new ArrayList<Curso>();
		Alumno a1 = new Alumno("Guille",24687);
		Alumno a2 = new Alumno("Fran",24657);
		Alumno a3 = new Alumno("Fede",24683);
		Alumno a4 = new Alumno("Bode",24653);
		
		
		System.out.println("Inscribir AMI");
		System.out.println(c1.inscribir(a1));
		//Cupo restante: 2
		System.out.println(c1.inscribir(a2));	
		//Cupo restante: 1
		System.out.println(c1.inscribir(a3));	
		//Cupo restante: 0
		System.out.println(c1.inscribir(a4));
		//Sin cupo para inscribir, retorna false
		
		System.out.println("Imprimir inscriptos AMI");
		c1.imprimirInscriptos();
		
		Curso c2 = new Curso(2,"AMII",2018,2,20,20);
		
		aprobados.add(c1); //Set aprobados AMI -> Obtienen 20 creditos
		a1.setAprobados(aprobados);
		//a2.setAprobados(aprobados);
		a3.setAprobados(aprobados);
		//a4.setAprobados(aprobados);
		
		System.out.println("Inscribir AMII");
		System.out.println(c2.inscribir(a1));
		//Cupo restante: 1
		System.out.println(c2.inscribir(a2));	
		//Creditos insuficienes, retorna false
		System.out.println(c2.inscribir(a3));	
		//Cupo restante: 0
		System.out.println(c2.inscribir(a4));
		//Creditos insuficienes y sin cupo para inscribir, retorna false
		System.out.println("Imprimir inscriptos AMII");
		c2.imprimirInscriptos();
	}
}
