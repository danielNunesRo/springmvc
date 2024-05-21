package com.danielnunesro.trainingmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.danielnunesro.trainingmvc.dao.FuncionarioDao;
import com.danielnunesro.trainingmvc.domain.Funcionario;

public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;
	
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Funcionario buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

}
