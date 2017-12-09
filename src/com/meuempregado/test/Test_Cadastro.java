package com.meuempregado.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.meuempregado.bean.ContratoSeguroManagedBean;
import com.meuempregado.bean.DemissaoBean;
import com.meuempregado.bean.MensagemManagedBean;
import com.meuempregado.model.ContratoDemissao;
import com.meuempregado.model.ContratoSeguro;
import com.meuempregado.model.Empregado;
import com.meuempregado.model.Empregador;
import com.meuempregado.model.Mensagem;
import com.meuempregado.service.ContratoSeguroService;
import com.meuempregado.service.EmpregadoService;
import com.meuempregado.service.EmpregadorService;
import com.meuempregado.service.MensagemService;
import com.meuempregado.service.TipoDemissaoService;

public class Test_Cadastro {
	@Test
	public void cadastrarEmpregados() throws SQLException{
		DemissaoBean bean = new DemissaoBean();
		bean.salvarDemissaoAction();
		 /* ContratoSeguroService service = new ContratoSeguroService();
		ContratoSeguroManagedBean bean = new ContratoSeguroManagedBean();
		List<ContratoSeguro> list = service.listar();
		
		bean.setContrato(list.get(0));
		bean.imprimir();
		Date data=null;
		try {
			data = new SimpleDateFormat("dd/MM/yyyy").parse("28/11/1997");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd");   
		
		EmpregadoService service = new EmpregadoService();
		Empregado e = new Empregado(null,"Rodrigo Bora",data,"111.111.111-11","11.111.111-1","1111-1111","(41)11111-1111","11111-111","Rua José Rodrigues Pinheiro",2261,"Sobrado A","CIC","Lapa","PR",true,true,"Mordomo","daniel.barbosa21@hotmail.com","1234");
		service.cadastrar(e);*/
	}
}
