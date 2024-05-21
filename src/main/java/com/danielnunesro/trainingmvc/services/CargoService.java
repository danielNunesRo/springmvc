package com.danielnunesro.trainingmvc.services;

import java.util.List;

import com.danielnunesro.trainingmvc.domain.Cargo;

public interface CargoService {
	
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
	
}
