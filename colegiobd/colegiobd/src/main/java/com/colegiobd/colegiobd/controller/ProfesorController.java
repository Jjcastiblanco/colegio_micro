package com.colegiobd.colegiobd.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegiobd.colegiobd.entity.ProfesorEntity;
import com.colegiobd.colegiobd.service.ProfesorService;


@RestController
@RequestMapping("/teacher")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfesorController {
	
	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("/{id}")
	public Optional<ProfesorEntity> findById(@PathVariable("id") int id){
		return profesorService.finById(id);
	}
	
	@GetMapping("/all")
	public List<ProfesorEntity> findById(){
		return profesorService.finAll();
	}

}
