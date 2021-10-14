package com.colegiobd.colegiobd.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "estudiante_asignatura")
public class EstudianteAsignaturas {
	
	@EmbeddedId
	private AsignarutaEstudiantePK id;
	
	
	@ManyToOne
	@JoinColumn(name = "id_estudiante", updatable = false, insertable = false)
	private EstudianteEntity estudianteEntity;


	public EstudianteEntity getEstudianteEntity() {
		return estudianteEntity;
	}

	public void setEstudianteEntity(EstudianteEntity estudianteEntity) {
		this.estudianteEntity = estudianteEntity;
	}
	
	
	

}
