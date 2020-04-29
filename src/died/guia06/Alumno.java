package died.guia06;

import java.util.ArrayList;
import java.util.List;


public class Alumno implements Comparable<Object>{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public int creditosObtenidos() {
		Integer creditos=0;
		for (int i = 0; i < aprobados.size(); i++) {
			creditos+=aprobados.get(i).getCreditos();
		}
		return creditos;
	}

	public void aprobar(Curso c) {
		this.aprobados.add(c);
		this.cursando.remove(c);
	}

	public Alumno() {
		this.cursando = new ArrayList<Curso>();
		this.aprobados = new ArrayList<Curso>();
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
		this.cursando=cursando;
		/*for (int i = 0; i < cursando.size(); i++) {
			this.cursando.add(cursando.get(i));
		}*/
	}

	public List<Curso> getAprobados() {
		return aprobados;
	}

	public void setAprobados(List<Curso> aprobados) {
		this.aprobados=aprobados;
		/*
		for (int j = 0; j < aprobados.size(); j++) {
			this.cursando.remove(aprobados.get(j));
		}
		for (int i = 0; i < aprobados.size(); i++) {
			this.aprobados.add(aprobados.get(i));
		}
		*/
		
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
