package com.colegiobd.colegiobd.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "asignatura")
public class AsignaturaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_asignatura")
	private Integer idAsignaura;
	
	@ManyToOne
	@JoinColumn(name = "id_materia", insertable = false, updatable = false)
	private MateriaEntity materiaEntity;
	
	@ManyToOne
	@JoinColumn(name = "id_profesor", insertable = false, updatable = false)
	private ProfesorEntity profesorEntity;
	
	
	@OneToMany( mappedBy = "estudianteEntity")
	private List<EstudianteAsignaturas> estudiantes;
	
	@ManyToOne
	@JoinColumn(name = "id_curso", insertable = false, updatable = false)
	private CursoEntity curso;

	public Integer getIdAsignaura() {
		return idAsignaura;
	}

	public void setIdAsignaura(Integer idAsignaura) {
		this.idAsignaura = idAsignaura;
	}
	
	
	
	public MateriaEntity getMateriaEntity() {
		return materiaEntity;
	}

	public void setMateriaEntity(MateriaEntity materiaEntity) {
		this.materiaEntity = materiaEntity;
	}

	public List<EstudianteAsignaturas> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<EstudianteAsignaturas> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public ProfesorEntity getProfesorEntity() {
		return profesorEntity;
	}

	public void setProfesorEntity(ProfesorEntity profesorEntity) {
		this.profesorEntity = profesorEntity;
	}

	public CursoEntity getCurso() {
		return curso;
	}

	public void setCurso(CursoEntity curso) {
		this.curso = curso;
	}
	
}
