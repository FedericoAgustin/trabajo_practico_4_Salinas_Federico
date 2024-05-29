package ar.edu.unju.fi.model;

public class Materia {
	private Integer codigoMateria;
	private String nombreMateria;
	private String cursoMateria;
	private Integer cantHoraMateria;
	private modalidad modalidadMateria;
	private String docenteMateria;

	public enum modalidad {
		VIRTUAL, PRESENCIAL
	}
}
