package com.colegiobd.colegiobd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegiobd.colegiobd.entity.ProfesorEntity;

@Repository
public interface ProfesorRepository extends JpaRepository<ProfesorEntity, Integer> {
	
}
