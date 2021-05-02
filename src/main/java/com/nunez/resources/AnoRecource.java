package com.nunez.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nunez.entities.Ano;
import com.nunez.services.AnoService;


@RestController
@RequestMapping(value = "/ano")
public class AnoRecource {
	
	@Autowired
	private AnoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Ano> findById(@PathVariable Long id){
		Ano obj = service.getById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Ano>> findAll(){
		
		List<Ano> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
