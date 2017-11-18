package com.meuempregado.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.meuempregado.model.ContratoSeguro;
import com.meuempregado.model.Empregado;
import com.meuempregado.model.Mensagem;
import com.meuempregado.model.PacoteSeguro;
import com.meuempregado.service.ContratoSeguroService;
import com.meuempregado.service.EmpregadoService;
import com.meuempregado.service.PacoteSeguroService;

@ManagedBean(name = "contratoSeguroManagedBean")
@SessionScoped
public class ContratoSeguroManagedBean implements Serializable{
	private static final long serialVersionUID = -4640086967386715764L;
	
	private ContratoSeguro contrato;
	private List<ContratoSeguro> contratos;
	private ContratoSeguroService service;
	
    private Integer idempregado;
    private Mensagem mensagem = new Mensagem(); 
	
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
	public void addEmpregadoAction(){
		
		EmpregadoService service = new EmpregadoService();
		Empregado empregado = service.buscarId(idempregado);
		
		contrato.setRg_funcionario(empregado.getRg());
		contrato.setNome_funcionario(empregado.getNomeCompleto());
		contrato.setCpf_funcionario(empregado.getCpf());
		contrato.setEndereco_rua_funcionario(empregado.getEnderecoRua());
		contrato.setCep_funcionario(empregado.getCep());
		contrato.setCidade_funcionario(empregado.getCidade());
		contrato.setUf_funcionario(empregado.getUf());
		
		contrato.setNome_empregador(mensagem.getNomeempresa());
		contrato.setVaga_empregador(mensagem.getVaga());
	}
	public String addPacote1(){
		addEmpregadoAction();
		PacoteSeguroService pacoteservice = new PacoteSeguroService();
		PacoteSeguro pacote = pacoteservice.buscarId(1);
		
		contrato.setNome_pacote(pacote.getNome());
		contrato.setCobertura_pacote(pacote.getCobertura());
		contrato.setDescricao_pacote(pacote.getDescricao());
		contrato.setIndenizacao_pacote(pacote.getIndenizacao());
		contrato.setValorMensal_pacote(pacote.getValorMensal());
		
		contrato.setAtivo(true);
		service.cadastrar(contrato);
		
		atualizar();
		return "novaMensagemEMPREGADO";
	}
	public String addPacote2(){
		addEmpregadoAction();
		PacoteSeguroService pacoteservice = new PacoteSeguroService();
		PacoteSeguro pacote = pacoteservice.buscarId(2);
		
		contrato.setNome_pacote(pacote.getNome());
		contrato.setCobertura_pacote(pacote.getCobertura());
		contrato.setDescricao_pacote(pacote.getDescricao());
		contrato.setIndenizacao_pacote(pacote.getIndenizacao());
		contrato.setValorMensal_pacote(pacote.getValorMensal());
		contrato.setAtivo(true);
		service.cadastrar(contrato);
		
		atualizar();
		return "novaMensagemEMPREGADO";
	}
	public String addPacote3(){
		addEmpregadoAction();
		PacoteSeguroService pacoteservice = new PacoteSeguroService();
		PacoteSeguro pacote = pacoteservice.buscarId(3);
		
		contrato.setNome_pacote(pacote.getNome());
		contrato.setCobertura_pacote(pacote.getCobertura());
		contrato.setDescricao_pacote(pacote.getDescricao());
		contrato.setIndenizacao_pacote(pacote.getIndenizacao());
		contrato.setValorMensal_pacote(pacote.getValorMensal());
		contrato.setAtivo(true);
		service.cadastrar(contrato);
		
		atualizar();
		return "novaMensagemEMPREGADO";
	}
	public String cancelar(){
		atualizar();
		return "novaMensagemEMPREGADO";
	}
	public String restringir(){
		contrato.setAtivo(false);
		service.atulizar(contrato);
		
		atualizar();
		return "listaContratoSeguro";
	}
	public void Imprimir(){
		service.imprimir(contrato);
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
	public void atualizar(){
		contrato = new ContratoSeguro();
		service = new ContratoSeguroService();
		contratos = service.listar();
	}
	public Mensagem getMensagem() {
		return mensagem;
	}
	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	public Integer getIdempregado() {
		return idempregado;
	}
	public void setIdempregado(Integer idempregado) {
		this.idempregado = idempregado;
	}
}
