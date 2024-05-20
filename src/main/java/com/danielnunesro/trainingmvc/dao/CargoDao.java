package com.danielnunesro.trainingmvc.dao;

import java.util.List;

import com.danielnunesro.trainingmvc.domain.Cargo;
import com.danielnunesro.trainingmvc.domain.Departamento;

public interface CargoDao {
	
	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete (Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	
}
