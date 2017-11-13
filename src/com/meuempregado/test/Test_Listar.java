package com.meuempregado.test;

import java.util.List;

import org.junit.Test;

import com.meuempregado.bean.ContratoSeguroManagedBean;
import com.meuempregado.bean.EmpregadoManagedBean;
import com.meuempregado.bean.PacoteSeguroManagedBean;
import com.meuempregado.model.ContratoSeguro;
import com.meuempregado.model.Empregado;
import com.meuempregado.model.PacoteSeguro;
import com.meuempregado.service.ContratoSeguroService;
import com.meuempregado.service.PacoteSeguroService;

public class Test_Listar {
	@Test
	public void Listar(){
		
		ContratoSeguroManagedBean service = new ContratoSeguroManagedBean();
		service.setIdEmpregado(11);
		service.setIdEmpregador(7);
		service.addEmpregadoAction();
		service.addPacote1();
		System.out.println("DEU BOA"+service.getContrato().getNome_funcionario()+service.getContrato().getNome_empregador()+service.getContrato().getCobertura_pacote());
	}
}
