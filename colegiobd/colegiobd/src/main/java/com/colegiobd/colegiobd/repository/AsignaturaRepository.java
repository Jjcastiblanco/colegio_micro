package com.colegiobd.colegiobd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.colegiobd.colegiobd.entity.AsignaturaEntity;


@Repository
public interface AsignaturaRepository extends JpaRepository<AsignaturaEntity, Integer>{

	@Query
	(value =""
			+ "SELECT m.nombre_materia, e.nombre_estudiante, c.grado_curso from profesor p "
			+ "JOIN asignatura a on a.id_profesor = p.id_profesor "
			+ "JOIN curso c on c.id_curso = a.id_curso "
			+ "JOIN materias m on m.id_materia = a.id_materia "
			+ "JOIN estudiante_asignatura es on a.id_asignatura = "
			+ "es.id_asignatura JOIN estudiante e on es.id_estudiante = e.id_estudiante WHERE a.id_profesor = (?1)", nativeQuery = true)
	List<String> finByEstudentById(int idTeacher);

}
