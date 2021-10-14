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
@Table(name = "materias")
public class MateriaEntity {
	
	@Id
	@Column(name = "id_materia")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idMateria;
	
	@Column(name= "nombre_materia")
	private String nombreMateria;
	
	@OneToMany(mappedBy = "materiaEntity")
	private List<AsignaturaEntity> asignatura;
	
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

}
