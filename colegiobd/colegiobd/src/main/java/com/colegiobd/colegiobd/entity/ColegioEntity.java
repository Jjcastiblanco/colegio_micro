package com.colegiobd.colegiobd.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table( name = "colegio")
public class ColegioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_colegio")
	private Integer idColegio;
	
	@Column(name = "nombre_colegio")
	private String nombreColegio;
	
	@OneToMany(mappedBy = "colegioEntity" )
	private List<CursoEntity> cursos;

	public Integer getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(Integer idColegio) {
		this.idColegio = idColegio;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

}
