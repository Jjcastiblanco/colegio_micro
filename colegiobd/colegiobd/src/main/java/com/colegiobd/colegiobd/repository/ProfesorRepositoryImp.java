package com.colegiobd.colegiobd.repository;


import java.util.List;
import java.util.Optional;

import com.colegiobd.colegiobd.entity.ProfesorEntity;


public interface ProfesorRepositoryImp  {
	
	Optional<ProfesorEntity> finById(int id);
	
	List<ProfesorEntity> finAll();

}
