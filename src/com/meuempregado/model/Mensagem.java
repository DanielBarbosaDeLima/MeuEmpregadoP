package com.meuempregado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_mensagem")
public class Mensagem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String nomeempresa;
	private String email;
	private String resposta;
	private String endereco;
	private String vaga;
	private String nomeFuncionario;
	private String cpfFuncionario;
	private String salario;
	private String beneficios;
	private String data;
	
	private Boolean ativo;
	
	private Integer idContratoSeguro;
	private Boolean ofereceSeguro;
	
	public Mensagem(){
		
	}
	public Mensagem(Integer id, String nomeempresa, String email, String resposta, String endereco, String vaga,
			String nomeFuncionario, String cpfFuncionario, String salario, String beneficios, String data,
			Boolean ativo, Integer idContratoSeguro, Boolean ofereceSeguro) {
		this.id = id;
		this.nomeempresa = nomeempresa;
		this.email = email;
		this.resposta = resposta;
		this.endereco = endereco;
		this.vaga = vaga;
		this.nomeFuncionario = nomeFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.salario = salario;
		this.beneficios = beneficios;
		this.data = data;
		this.ativo = ativo;
		this.idContratoSeguro = idContratoSeguro;
		this.ofereceSeguro = ofereceSeguro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeempresa() {
		return nomeempresa;
	}
	public void setNomeempresa(String nomeempresa) {
		this.nomeempresa = nomeempresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getVaga() {
		return vaga;
	}
	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public Integer getIdContratoSeguro() {
		return idContratoSeguro;
	}
	public void setIdContratoSeguro(Integer IdContratoSeguro) {
		idContratoSeguro = IdContratoSeguro;
	}
	public Boolean getOfereceSeguro() {
		return ofereceSeguro;
	}
	public void setOfereceSeguro(Boolean ofereceSeguro) {
		this.ofereceSeguro = ofereceSeguro;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
