package com.meuempregado.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.meuempregado.bean.ContratoSeguroManagedBean;
import com.meuempregado.bean.PacoteSeguroManagedBean;
import com.meuempregado.model.ContratoSeguro;
import com.meuempregado.model.Empregado;
import com.meuempregado.model.PacoteSeguro;
import com.meuempregado.service.ContratoSeguroService;
import com.meuempregado.service.EmpregadoService;
import com.meuempregado.service.PacoteSeguroService;

public class Test_Listar {
	@Test
	public void Listar() throws ClassNotFoundException, SQLException, IOException{
		
	PacoteSeguroService service = new PacoteSeguroService();
	List<PacoteSeguro> pacotes = service.listar();
	
	for(PacoteSeguro p:pacotes){
		System.out.println(p.getNome());
	}
		
	}
}
