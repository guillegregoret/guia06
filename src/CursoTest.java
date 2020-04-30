import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import died.guia06.Alumno;
import died.guia06.Curso;

public class CursoTest {
	private ArrayList<Curso> array1, array2;
	private Curso c1, c2,c3;
	private Alumno a,b,c;
	@Test
	public void InscribirCreditosInsuficientesTest() {
		//System.out.println("Test1");
		array1 = new ArrayList<Curso>();
		array2 = new ArrayList<Curso>();
		a = new Alumno();
		c1 = new Curso();
		c2 = new Curso();
		c3 = new Curso();
		
		c1.setCicloLectivo(2019);
		c2.setCicloLectivo(2020);
		c3.setCicloLectivo(2020);
		c1.setCupo(15);
		c2.setCupo(15);
		c3.setCupo(15);
		c1.setCreditos(20);
		c2.setCreditos(20);
		c3.setCreditosRequeridos(30);
		
		array1.add(c1);
		
		array2.add(c2);
		array2.add(c2);

		a.setAprobados(array1);
		a.setCursando(array2);

		assertSame(false,c3.inscribir(a)); //Creditos insuficientes para inscribirse 20/30
	}
	@Test
	public void InscribirCreditosSuficientesTest() {
		//System.out.println("Test2");
		
		array1 = new ArrayList<Curso>();
		array2 = new ArrayList<Curso>();
		a = new Alumno();
		c1 = new Curso();
		c2 = new Curso();
		c3 = new Curso();
		
		c1.setCicloLectivo(2019);
		c2.setCicloLectivo(2020);
		c3.setCicloLectivo(2020);
		c1.setCupo(15);
		c2.setCupo(15);
		c3.setCupo(15);
		c1.setCreditos(20);
		c2.setCreditos(30);
		c3.setCreditosRequeridos(20);
		
		array1.add(c1);
		array2.add(c2);

		a.setAprobados(array1);
		a.setCursando(array2);
		assertSame(true,c3.inscribir(a)); //Creditos suficientes para inscribirse 20/20
	}
	@Test
	public void ImprimirOrdenAlfabetico() {
		array1 = new ArrayList<Curso>();
		a = new Alumno();
		b = new Alumno();
		c = new Alumno();
		c1 = new Curso();
		a.setNombre("Alejandro");
		b.setNombre("Bautista");
		c.setNombre("Cecilia");
		c1.setCreditosRequeridos(0);
		c1.setCupo(10);
		c1.inscribir(c);
		c1.inscribir(c);
		c1.inscribir(b);
		c1.inscribir(c);
		c1.inscribir(a);
		c1.inscribir(c);
		c1.inscribir(a);
		c1.inscribir(a);
		c1.imprimirInscriptos();
	}
}
