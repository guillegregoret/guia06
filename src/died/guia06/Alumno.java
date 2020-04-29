package died.guia06;

import java.util.List;


public class Alumno implements Comparable{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public int creditosObtenidos() {
		return 1;
	}

	public void aprobar(Curso c) {
		this.aprobados.add(c);
		this.cursando.remove(c);
	}

	public void inscripcionAceptada(Curso c) {
		this.cursando.add(c);
	}
	
	public boolean equals(Alumno a) {
		return (this.nroLibreta==a.nroLibreta);
	}
	public int compareTo (Alumno a1, Alumno a2){
		return a1.getNombre().compareTo(a2.getNombre());
	}
	public int compareTo (Alumno a){
		return this.getNombre().compareTo(a.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNroLibreta() {
		return nroLibreta;
	}

	public void setNroLibreta(Integer nroLibreta) {
		this.nroLibreta = nroLibreta;
	}

	public List<Curso> getCursando() {
		return cursando;
	}

	public void setCursando(List<Curso> cursando) {
		this.cursando = cursando;
	}

	public List<Curso> getAprobados() {
		return aprobados;
	}

	public void setAprobados(List<Curso> aprobados) {
		this.aprobados = aprobados;
	}

	
	

}
