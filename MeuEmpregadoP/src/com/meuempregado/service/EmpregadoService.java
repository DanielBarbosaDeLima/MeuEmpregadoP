package com.meuempregado.service;

import java.util.List;

import com.meuempregado.dao.FactoryDao;
import com.meuempregado.model.Empregado;

public class EmpregadoService {
	
	public void cadastrar(Empregado e){
		FactoryDao.createGenericDao(Empregado.class).inserir(e);
	}
	
	public List<Empregado>listar(){
		return FactoryDao.createGenericDao(Empregado.class).listarTodos();
	}
	
	public void excluir(Empregado e){
		FactoryDao.createGenericDao(Empregado.class).excluir(e.getId());
	}
	public void atulizar(Empregado e){
		FactoryDao.createGenericDao(Empregado.class).alterar(e);
	}
	public Empregado buscarId(Integer id){
		return FactoryDao.createGenericDao(Empregado.class).buscarPorId(id);
	}
}
