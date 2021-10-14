package com.colegiobd.colegiobd.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class EstudianteEntity {
	
	@Id
	@Column(name = "id_estudiante")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer idEstudiante;
	
	@Column(name = "nombre_estudiante" )
	private String nombreEstudiante;
	
	public Integer getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
}
