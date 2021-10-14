package com.colegiobd.colegiobd.repository;

import java.util.List;
import java.util.Optional;

import com.colegiobd.colegiobd.entity.AsignaturaEntity;

public interface AsignaturaRepositoryImp  {
	
	
	List<AsignaturaEntity> getAll();
	
	Optional<AsignaturaEntity> finById(int id); 
	
	List<String> finByEstudentById(int idTeacher);
	
}
