package com.colegiobd.colegiobd.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegiobd.colegiobd.entity.ProfesorEntity;
import com.colegiobd.colegiobd.repository.ProfesorRepository;
import com.colegiobd.colegiobd.repository.ProfesorRepositoryImp;


@Service
public class ProfesorService implements ProfesorRepositoryImp {

	@Autowired
	private ProfesorRepository profesorRepository;
	
	
	@Override
	public Optional<ProfesorEntity> finById(int id) {
		return profesorRepository.findById(id);
	}


	@Override
	public List<ProfesorEntity> finAll() {
		return profesorRepository.findAll();
	}
	
	

}
