package com.colegiobd.colegiobd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegiobd.colegiobd.entity.AsignaturaEntity;
import com.colegiobd.colegiobd.repository.AsignaturaRepository;
import com.colegiobd.colegiobd.repository.AsignaturaRepositoryImp;


@Service
public class AsignaturaService implements AsignaturaRepositoryImp {
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	public List<AsignaturaEntity> getAll() {
		return asignaturaRepository.findAll();
	}

	@Override
	public Optional<AsignaturaEntity> finById(int id) {
		return asignaturaRepository.findById(id);
	}

	@Override
	public List<String> finByEstudentById(int idTeacher) {
		return asignaturaRepository.finByEstudentById(idTeacher);
	}

}
