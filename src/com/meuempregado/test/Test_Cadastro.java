package com.meuempregado.test;

import org.junit.Test;

import com.meuempregado.model.Empregado;
import com.meuempregado.model.Empregador;
import com.meuempregado.service.EmpregadoService;
import com.meuempregado.service.EmpregadorService;

public class Test_Cadastro {
	@Test
	public void cadastrarEmpregados(){
		EmpregadoService empregadoservice = new EmpregadoService();
		Empregado empregado = new Empregado(null,"Adriano","28/11/1997","333.333.333-33","33.333.333-3","1111-1111","1111-1111","11111-111","José Rodrigues Pinheiro",2261,"Sobrado A","CIC","Curitiba","PR","daniel@hotmail.com","1234","Não","Trabalhando","Masculino","Eletricista");
		empregadoservice.cadastrar(empregado);
		
		EmpregadorService empregadorservice = new EmpregadorService();
		Empregador empregador = new Empregador(null,"Helcio","444.444.444.44");
		empregadorservice.cadastrar(empregador);
	}
}
