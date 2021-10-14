package com.colegiobd.colegiobd.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;




@Embeddable
public class AsignarutaEstudiantePK implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id_Asignatura;
	
	private Integer id_Estudiante;

	public Integer getId_Asignatura() {
		return id_Asignatura;
	}

	public void setId_Asignatura(Integer id_Asignatura) {
		this.id_Asignatura = id_Asignatura;
	}

	public Integer getId_Estudiante() {
		return id_Estudiante;
	}

	public void setId_Estudiante(Integer id_Estudiante) {
		this.id_Estudiante = id_Estudiante;
	}
	
	
}
