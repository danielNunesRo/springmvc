package com.danielnunesro.trainingmvc.services;

import java.util.List;

import com.danielnunesro.trainingmvc.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();
	
	
}
