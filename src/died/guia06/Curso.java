package died.guia06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import died.guia06.util.Registro;
public class Curso {

	private Integer id;
	private String nombre;
	private Integer cicloLectivo;
	private Integer cupo; 
	private List<Alumno> inscriptos;
	private Integer creditos;
	private Integer creditosRequeridos;
	private int materias_nivel=0;
	private Registro log;
	
	public Curso() {
		super();
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();
	}
	/**
	 * Este método, verifica si el alumno se puede inscribir y si es así lo agrega al curso,
	 * agrega el curso a la lista de cursos en los que está inscripto el alumno y retorna verdadero.
	 * Caso contrario retorna falso y no agrega el alumno a la lista de inscriptos ni el curso a la lista
	 * de cursos en los que el alumno está inscripto.
	 * 
	 * Para poder inscribirse un alumno debe
	 * 		a) tener como minimo los creditos necesarios
	 *      b) tener cupo disponibles
	 *      c) puede estar inscripto en simultáneo a no más de 3 cursos del mismo ciclo lectivo.
	 * @param a
	 * @return
	 */
	public Boolean inscribir(Alumno a) {

		try {

			materias_nivel=0;
			
			for (int i = 0; i < a.getCursando().size(); i++) {
				if(a.getCursando().get(i).getCicloLectivo().equals(this.cicloLectivo)) {
					materias_nivel++;
				}
			}
			if(a.creditosObtenidos()>=this.creditosRequeridos && (this.cupo-this.inscriptos.size())>0 && materias_nivel<3) {
				this.inscriptos.add(a);
				log.registrar(this, "inscribir ",a.toString());
				return true;
			}else {
				return false;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	/**
	 * imprime los inscriptos en orden alfabetico
	 */
	public void imprimirInscriptos() {
		
		try {
			Collections.sort(this.inscriptos, new CompAlfaberico());
			for (int i = 0; i < this.inscriptos.size(); i++) {
				System.out.println(this.inscriptos.get(i).getNombre());
			}
			log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCicloLectivo() {
		return cicloLectivo;
	}
	public void setCicloLectivo(Integer cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}
	public Integer getCupo() {
		return cupo;
	}
	public void setCupo(Integer cupo) {
		this.cupo = cupo;
	}
	public List<Alumno> getInscriptos() {
		return inscriptos;
	}
	public void setInscriptos(List<Alumno> inscriptos) {
		this.inscriptos = inscriptos;
	}
	public Integer getCreditos() {
		return creditos;
	}
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	public Integer getCreditosRequeridos() {
		return creditosRequeridos;
	}
	public void setCreditosRequeridos(Integer creditosRequeridos) {
		this.creditosRequeridos = creditosRequeridos;
	}
	public Registro getLog() {
		return log;
	}
	public void setLog(Registro log) {
		this.log = log;
	}


}
