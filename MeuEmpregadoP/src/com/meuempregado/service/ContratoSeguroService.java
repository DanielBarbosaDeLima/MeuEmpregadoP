package com.meuempregado.service;

import java.util.List;

import com.meuempregado.dao.FactoryDao;
import com.meuempregado.model.ContratoSeguro;

public class ContratoSeguroService {
	
	public void cadastrar(ContratoSeguro cs){
		FactoryDao.createGenericDao(ContratoSeguro.class).inserir(cs);
	}
	
	public List<ContratoSeguro>listar(){
		return FactoryDao.createGenericDao(ContratoSeguro.class).listarTodos();
	}
	
	public void excluir(ContratoSeguro cs){
		FactoryDao.createGenericDao(ContratoSeguro.class).excluir(cs.getId());;
	}
	public void atulizar(ContratoSeguro cs){
		FactoryDao.createGenericDao(ContratoSeguro.class).alterar(cs);
	}
}
