package com.meuempregado.dao;


import java.io.IOException;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.meuempregado.model.Empregado;

public class EmpregadoDAO extends Dao{
	
	PreparedStatement ps;
	
	private String PROCURAR_NOME = "SELECT * FROM tb_empregado WHERE cidade LIKE ?";
	
	public List<Empregado> findEmpregadoByCidade(String cidade) throws ClassNotFoundException, SQLException, IOException{
		
		openConnection();
		
		List<Empregado> lista=new ArrayList<Empregado>();
		
		ps=connect.prepareStatement(PROCURAR_NOME);
		
	    ps.setString(1,cidade+"%");
	    
	    
	    
		//ps.setString(0, name);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			
			Empregado c=new Empregado();
			
			c.setId(rs.getInt("id"));
			c.setNomeCompleto(rs.getString("nomeCompleto"));
			c.setDataNascimento(rs.getDate("dataNascimento"));
			c.setCpf(rs.getString("cpf"));
			c.setRg(rs.getString("rg"));
			c.setTelefoneFixo(rs.getString("telefoneFixo"));
			c.setTelefoneCelular(rs.getString("telefoneCelular"));
			c.setCep(rs.getString("cep"));
			c.setEnderecoRua(rs.getString("enderecoRua"));
			c.setEnderecoNumero(rs.getInt("enderecoNumero"));
			c.setComplemento(rs.getString("complemento"));
			c.setBairro(rs.getString("bairro"));
			c.setCidade(rs.getString("cidade"));
			c.setUf(rs.getString("uf"));
			c.setEmail(rs.getString("email"));
			c.setSenha(rs.getString("senha"));
			c.setSexo(rs.getBoolean("sexo"));
			c.setDescricao(rs.getString("descricao"));
	
			lista.add(c);
		}
		
		return lista;
		
	}
}
