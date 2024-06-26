package com.danielnunesro.trainingmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.danielnunesro.trainingmvc.dao.DepartamentoDao;
import com.danielnunesro.trainingmvc.domain.Departamento;

public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;
	
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}

	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Departamento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

}
