package com.meuempregado.test;

import java.util.Date;

import org.junit.Test;

import com.meuempregado.bean.ContratoSeguroManagedBean;
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
	public void cadastrarEmpregados(){
		/*EmpregadoService empregadoservice = new EmpregadoService();
		Empregado empregado = new Empregado(null,"Adriano",(new Date()),"333.333.333-33","33.333.333-3","1111-1111","1111-1111","11111-111","José Rodrigues Pinheiro",2261,"Sobrado A","CIC","Araucária","PR",true,true,"Trabalhando como Eletricista","daniel@gmail.com","1234");
		empregadoservice.cadastrar(empregado);*/
		
		/*EmpregadorService empregadorservice = new EmpregadorService();
		Empregador empregador = new Empregador(null,"Helcio","444.444.444.44");
		empregadorservice.cadastrar(empregador)*/
		//ContratoSeguroManagedBean service = new ContratoSeguroManagedBean();
		//Mensagem ms = new Mensagem(null,"João", "email","josé","rua","baba","Thiago","111","1000","vt","16/11/2017",null,true);
		//service.setMensagem(ms);
		//System.out.println(service.addPacote1());
		TipoDemissaoService service = new TipoDemissaoService();
		ContratoDemissao c = new ContratoDemissao(null,"20/11/2017",3000,500,5000,4,"não","sim","justa");
		
		service.cadastrar(c);
		
	}
}
