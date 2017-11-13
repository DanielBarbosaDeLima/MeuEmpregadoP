package com.meuempregado.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.meuempregado.model.ContratoSeguro;
import com.meuempregado.model.Empregado;
import com.meuempregado.model.Empregador;
import com.meuempregado.model.PacoteSeguro;
import com.meuempregado.service.ContratoSeguroService;
import com.meuempregado.service.EmpregadoService;
import com.meuempregado.service.EmpregadorService;
import com.meuempregado.service.PacoteSeguroService;

@ManagedBean(name = "contratoSeguroManagedBean")
@SessionScoped
public class ContratoSeguroManagedBean implements Serializable{
	private static final long serialVersionUID = -4640086967386715764L;
	
	private ContratoSeguro contrato;
	private List<ContratoSeguro> contratos;
	private ContratoSeguroService service;
	
	private Integer idEmpregado;
	private Integer idEmpregador;
	
	public ContratoSeguroManagedBean(){
		atualizar();
	}
	public void inserirContratoSeguroAction(){
		service.cadastrar(contrato);
		atualizar();
	}
	
	public void atualizarContratoSeguroAction(){
		service.atulizar(contrato);
		atualizar();
	}
	public void excluirContratoSeguroAction(){
		service.excluir(contrato);
		atualizar();
	}
	public String addEmpregadoAction(){
		
	    EmpregadoService empregadoservice = new EmpregadoService();
	    Empregado empregado = new Empregado();
	    
	    EmpregadorService service = new EmpregadorService();
	    Empregador empregador = new Empregador();
	    
	    empregador = service.buscarId(idEmpregador);
		empregado = empregadoservice.buscarId(idEmpregado);
		
		contrato.setRg_funcionario(empregado.getRg());
		contrato.setNome_funcionario(empregado.getNomeCompleto());
		contrato.setCpf_funcionario(empregado.getCpf());
		contrato.setEndereco_rua_funcionario(empregado.getEnderecoRua());
		contrato.setCep_funcionario(empregado.getCep());
		contrato.setCidade_funcionario(empregado.getCidade());
		contrato.setUf_funcionario(empregado.getUf());
		contrato.setFuncao_funcionario(empregado.getFuncao());
		
		contrato.setNome_empregador(empregador.getNomeCompleto());
		contrato.setCpf_empregador(empregador.getCpf());
		
		return "contratoPacoteSeguro";
	}
	public String addPacote1(){
		PacoteSeguroService pacoteservice = new PacoteSeguroService();
		PacoteSeguro pacote = pacoteservice.buscarId(1);
		
		contrato.setNome_pacote(pacote.getNome());
		contrato.setCobertura_pacote(pacote.getCobertura());
		contrato.setDescricao_pacote(pacote.getDescricao());
		contrato.setIndenizacao_pacote(pacote.getIndenizacao());
		contrato.setValorMensal_pacote(pacote.getValorMensal());
		service.cadastrar(contrato);
		
		atualizar();
		return "listaContratoSeguro";
	}
	public String addPacote2(){
		PacoteSeguroService pacoteservice = new PacoteSeguroService();
		PacoteSeguro pacote = pacoteservice.buscarId(2);
		
		contrato.setNome_pacote(pacote.getNome());
		contrato.setCobertura_pacote(pacote.getCobertura());
		contrato.setDescricao_pacote(pacote.getDescricao());
		contrato.setIndenizacao_pacote(pacote.getIndenizacao());
		contrato.setValorMensal_pacote(pacote.getValorMensal());
		service.cadastrar(contrato);
		
		atualizar();
		return "listaContratoSeguro";
	}
	public String addPacote3(){
		PacoteSeguroService pacoteservice = new PacoteSeguroService();
		PacoteSeguro pacote = pacoteservice.buscarId(3);
		
		contrato.setNome_pacote(pacote.getNome());
		contrato.setCobertura_pacote(pacote.getCobertura());
		contrato.setDescricao_pacote(pacote.getDescricao());
		contrato.setIndenizacao_pacote(pacote.getIndenizacao());
		contrato.setValorMensal_pacote(pacote.getValorMensal());
		service.cadastrar(contrato);
		
		atualizar();
		return "listaContratoSeguro";
	}
	public ContratoSeguro getContrato() {
		return contrato;
	}
	public void setContrato(ContratoSeguro contrato) {
		this.contrato = contrato;
	}
	public List<ContratoSeguro> getContratos() {
		return contratos;
	}
	public void setContratos(List<ContratoSeguro> contratos) {
		this.contratos = contratos;
	}
	public ContratoSeguroService getService() {
		return service;
	}
	public void setService(ContratoSeguroService service) {
		this.service = service;
	}
	public Integer getIdEmpregado() {
		return idEmpregado;
	}
	public void setIdEmpregado(Integer idEmpregado) {
		this.idEmpregado = idEmpregado;
	}
	public Integer getIdEmpregador() {
		return idEmpregador;
	}
	public void setIdEmpregador(Integer idEmpregador) {
		this.idEmpregador = idEmpregador;
	}
	public void atualizar(){
		contrato = new ContratoSeguro();
		service = new ContratoSeguroService();
		contratos = service.listar();
	}
	
}
