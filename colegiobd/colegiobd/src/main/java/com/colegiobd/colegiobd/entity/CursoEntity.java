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
@Table( name = "curso")
public class CursoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private Integer idCurso;
	
	@Column(name = "grado_curso")
	private String gradoCurso;
	
	@Column(name = "salon_curso")
	private String salonCurso;
	
	@ManyToOne
	@JoinColumn(name = "id_colegio", insertable = false, updatable = false)
	private ColegioEntity colegioEntity;
	
	@OneToMany(mappedBy = "curso")
	private List<AsignaturaEntity> asignaturas;

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getGradoCurso() {
		return gradoCurso;
	}

	public void setGradoCurso(String gradoCurso) {
		this.gradoCurso = gradoCurso;
	}

	public String getSalonCurso() {
		return salonCurso;
	}

	public void setSalonCurso(String salonCurso) {
		this.salonCurso = salonCurso;
	}

	public ColegioEntity getColegioEntity() {
		return colegioEntity;
	}

	public void setColegioEntity(ColegioEntity colegioEntity) {
		this.colegioEntity = colegioEntity;
	}
	
}
