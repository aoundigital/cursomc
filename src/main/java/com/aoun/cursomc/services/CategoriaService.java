package com.aoun.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aoun.cursomc.domain.Categoria;
import com.aoun.cursomc.repositories.CategoriaRepository;
import com.aoun.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {		
		Categoria obj = repo.findOne(id);
		if (obj == null){
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Categoria.class.getName());			
		}
		return obj;		
	}
	
	public Categoria Insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
}
