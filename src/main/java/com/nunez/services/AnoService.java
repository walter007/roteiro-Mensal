package com.nunez.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nunez.entities.Ano;
import com.nunez.repositories.AnoRepository;

@Service
public class AnoService {
	
	@Autowired
	private AnoRepository repository;
	
	public Ano getById(long id) {
		Optional<Ano> obj = repository.findById(id);
		return obj.get();
	}
	
	public List<Ano> findAll(){
		return repository.findAll();
	}
}
