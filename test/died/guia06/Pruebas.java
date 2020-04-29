package died.guia06;
import java.util.ArrayList;
import java.util.List;

import died.guia06.*;

public class Pruebas {
public static void main(String[] args) {
	ArrayList<Curso> array1 = new ArrayList<Curso>();
	Alumno Guille = new Alumno();
	Curso DIED = new Curso();
	Curso AEDD = new Curso();

	DIED.setCicloLectivo(2020);
	DIED.setCreditos(15);
	DIED.setCreditosRequeridos(0);
	DIED.setCupo(30);
	DIED.setNombre("DIED");
	DIED.setId(615);
	
	AEDD.setCicloLectivo(2018);
	AEDD.setCreditos(10);
	AEDD.setCreditosRequeridos(0);
	AEDD.setCupo(30);
	AEDD.setNombre("AEDD");
	AEDD.setId(600);
	
	Guille.aprobar(AEDD);
	
	
	array1.add(AEDD);
	Guille.setCursando(array1);
	
	System.out.println(DIED.inscribir(Guille)); //Retorna true
	DIED.setCreditosRequeridos(15);
	System.out.println(DIED.inscribir(Guille)); //Retorna false porque died pide 15 creditos y AEDD solo da 10

}
}
