package com.meuempregado.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.meuempregado.model.Empregado;
import com.meuempregado.service.EmpregadoService;

@ManagedBean(name = "empregadoManagedBean")
@SessionScoped
public class EmpregadoManagedBean implements Serializable{
	private static final long serialVersionUID = 1461852525898785719L;
	
	private Empregado empregado;
	private List<Empregado> empregados;
	private EmpregadoService service;
	
	public EmpregadoManagedBean(){
		atualizar();
	}
	public void inserirEmpregadoAction(){
		service.cadastrar(empregado);;
		atualizar();
	}
	
	public void atualizarEmpregadoAction(){
		service.atulizar(empregado);
		atualizar();
	}
	public void excluirEmpregadoAction(){
		service.excluir(empregado);
		atualizar();
	}
	public Empregado buscarId(Integer Id){
		return service.buscarId(Id);
	}
	
	public Empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}
	public List<Empregado> getEmpregados() {
		return empregados;
	}
	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	}
	public EmpregadoService getService() {
		return service;
	}
	public void setService(EmpregadoService service) {
		this.service = service;
	}
	public void atualizar(){
		empregado = new Empregado();
		service = new EmpregadoService();
		empregados = service.listar();
	}
}
