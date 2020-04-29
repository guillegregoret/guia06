package died.guia06;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class AlumnoTest {
	ArrayList<Curso> array1, array2;
	Curso curso1, curso2;
	Alumno a;
	
	@Before
	public void setUp(){
		array1 = new ArrayList<Curso>();
		curso1 = new Curso();
		curso2 = new Curso();
		a = new Alumno();
		
	}
	@Test
	public void testCreditosObtenidos() {
		curso1.setCreditos(20);
		curso2.setCreditos(10);
		array1.add(curso1);
		array1.add(curso2);
		a.setCursando(array1);
		a.setAprobados(array1);
		assertEquals(30,a.creditosObtenidos());
	}

	@Test
	public void testAprobar() {

		array1.add(curso1);
		array1.add(curso2);
		a.setAprobados(array1);

		assertSame(a.getAprobados(),array1);
	}

	@Test
	public void testInscripcionAceptada() {
		array1.add(curso1);
		array1.add(curso2);
		a.setCursando(array1);
		
		assertSame(a.getCursando(),array1);
	}

}
