package com.colegiobd.colegiobd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegiobd.colegiobd.entity.AsignaturaEntity;
import com.colegiobd.colegiobd.service.AsignaturaService;

@RestController
@RequestMapping("/Asignaturas")
@CrossOrigin(origins = "http://localhost:4200")
public class AsignaturaController {
	
	@Autowired
	private AsignaturaService asignaturaService;
	
	
	@GetMapping("/all")
	public List<AsignaturaEntity> getAll(){
		return asignaturaService.getAll();
	}
	
	
	@GetMapping("/{id}")
	public Optional<AsignaturaEntity> finById(@PathVariable("id") int id){
		return asignaturaService.finById(id);
	}
	
	@GetMapping("/course/{id}")
	public List<String> finByEstudentById(@PathVariable("id") int idTeacher){
		return asignaturaService.finByEstudentById(idTeacher);
	}
	
}
