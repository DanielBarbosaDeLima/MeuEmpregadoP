package com.meuempregado.model;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@Entity
@Table(name="tb_contratoseguro")
public class ContratoSeguro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String rg_funcionario;
	private String nome_funcionario;
	private String cpf_funcionario;
	private String endereco_rua_funcionario;
	private String cep_funcionario;
	private String cidade_funcionario;
	private String uf_funcionario;
	private String funcao_funcionario;
	
	private String nome_empregador;
	private String vaga_empregador;
	
	private String nome_pacote;
	private String cobertura_pacote;
	@Column(length = 1000)
	private String descricao_pacote;
	private Double indenizacao_pacote;
	private Double valorMensal_pacote;
	
	private Boolean ativo;
	
	public ContratoSeguro(){
		
	}
	public ContratoSeguro(Integer id, String rg_funcionario, String nome_funcionario, String cpf_funcionario,
			String endereco_rua_funcionario, String cep_funcionario, String cidade_funcionario, String uf_funcionario,
			String funcao_funcionario, String nome_empregador, String vaga_empregador, String nome_pacote,
			String cobertura_pacote, String descricao_pacote, Double indenizacao_pacote, Double valorMensal_pacote,
			Boolean ativo) {
		this.id = id;
		this.rg_funcionario = rg_funcionario;
		this.nome_funcionario = nome_funcionario;
		this.cpf_funcionario = cpf_funcionario;
		this.endereco_rua_funcionario = endereco_rua_funcionario;
		this.cep_funcionario = cep_funcionario;
		this.cidade_funcionario = cidade_funcionario;
		this.uf_funcionario = uf_funcionario;
		this.funcao_funcionario = funcao_funcionario;
		this.nome_empregador = nome_empregador;
		this.vaga_empregador = vaga_empregador;
		this.nome_pacote = nome_pacote;
		this.cobertura_pacote = cobertura_pacote;
		this.descricao_pacote = descricao_pacote;
		this.indenizacao_pacote = indenizacao_pacote;
		this.valorMensal_pacote = valorMensal_pacote;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRg_funcionario() {
		return rg_funcionario;
	}

	public void setRg_funcionario(String rg_funcionario) {
		this.rg_funcionario = rg_funcionario;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(String cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}

	public String getEndereco_rua_funcionario() {
		return endereco_rua_funcionario;
	}

	public void setEndereco_rua_funcionario(String endereco_rua_funcionario) {
		this.endereco_rua_funcionario = endereco_rua_funcionario;
	}

	public String getCep_funcionario() {
		return cep_funcionario;
	}

	public void setCep_funcionario(String cep_funcionario) {
		this.cep_funcionario = cep_funcionario;
	}

	public String getCidade_funcionario() {
		return cidade_funcionario;
	}

	public void setCidade_funcionario(String cidade_funcionario) {
		this.cidade_funcionario = cidade_funcionario;
	}

	public String getUf_funcionario() {
		return uf_funcionario;
	}

	public void setUf_funcionario(String uf_funcionario) {
		this.uf_funcionario = uf_funcionario;
	}

	public String getFuncao_funcionario() {
		return funcao_funcionario;
	}

	public void setFuncao_funcionario(String funcao_funcionario) {
		this.funcao_funcionario = funcao_funcionario;
	}

	public String getNome_pacote() {
		return nome_pacote;
	}

	public void setNome_pacote(String nome_pacote) {
		this.nome_pacote = nome_pacote;
	}

	public String getDescricao_pacote() {
		return descricao_pacote;
	}

	public void setDescricao_pacote(String descricao_pacote) {
		this.descricao_pacote = descricao_pacote;
	}

	public Double getIndenizacao_pacote() {
		return indenizacao_pacote;
	}

	public void setIndenizacao_pacote(Double indenizacao_pacote) {
		this.indenizacao_pacote = indenizacao_pacote;
	}

	public Double getValorMensal_pacote() {
		return valorMensal_pacote;
	}

	public void setValorMensal_pacote(Double valorMensal_pacote) {
		this.valorMensal_pacote = valorMensal_pacote;
	}

	public String getNome_empregador() {
		return nome_empregador;
	}

	public void setNome_empregador(String nome_empregador) {
		this.nome_empregador = nome_empregador;
	}
	
	public String getVaga_empregador() {
		return vaga_empregador;
	}

	public void setVaga_empregador(String vaga_empregador) {
		this.vaga_empregador = vaga_empregador;
	}

	public String getCobertura_pacote() {
		return cobertura_pacote;
	}
	
	public void setCobertura_pacote(String cobertura_pacote) {
		this.cobertura_pacote = cobertura_pacote;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String Indeniza��oReal(){
		Locale ptBr = new Locale("pt", "BR");
		String valorString = NumberFormat.getCurrencyInstance(ptBr).format(this.indenizacao_pacote);
		return valorString;
	}
	public String ValorMensalReal(){
		Locale ptBr = new Locale("pt", "BR");
		String valorString = NumberFormat.getCurrencyInstance(ptBr).format(this.valorMensal_pacote);
		return valorString;
	}
	public void imprimir(ContratoSeguro c){
		//PDF
				Document doc = new Document(PageSize.A4);
				doc.setPageSize(PageSize.A4.rotate());
				
					try {
						PdfWriter.getInstance(doc, new FileOutputStream("C:/Users/Daniel/Documents/"+c.getNome_funcionario()+c.getNome_empregador()+".pdf"));
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (DocumentException e) {
						e.printStackTrace();
					}
					doc.open();
					Font font = new Font(FontFamily.COURIER, 12);
				    
					Paragraph p1 = new Paragraph("CONTRATO DE SEGURO /n"
							+ "IDENTIFICA��O DAS PARTES CONTRATANTES: "
							+ "SEGURADO(A): "+c.getNome_funcionario()+", possui R.G. n� "+c.getRg_funcionario()+", C.P.F. n� "+c.getCpf_funcionario()+", residente e domiciliado(a) na rua,"+c.getEndereco_rua_funcionario()+" CEP "+c.getCep_funcionario()+", na cidade de "+c.getCidade_funcionario()+", no Estado de "+c.getUf_funcionario()+". /n"
							+ "SEGURADORA: Bradesco Seguro S/A, com sede Barueri, na rua avenida Alphaville 779, bairro EMPRESARIAL 18 DO FORTE, CEP 06.472-900, no Estado de SP, inscrita no C.N.P.J. n� 33.055.146/0001-93, cadastro estadual n� 65.12-0-00./n"
							+ "As partes acima identificadas t�m, entre si, justo e acertado, o presente CONTRATO DE SEGURO DE VIDA, que se reger� pelas cl�usulas seguintes e pelas condi��es descritas no presente. "
							+ "DO OBJETO DO CONTRATO/n"
							+ " Cl�usula 1�. O presente contrato tem como objeto a garantir AO SEGURADO as garantias do pacote de seguro "+c.getNome_pacote()+"  com a seguinte descri��o "+c.getCobertura_pacote()+" ("+c.getDescricao_pacote()+")  com o premio de indeniza��o no valor de "+c.Indeniza��oReal()+", ficando o SEGURADO OBRIGADO A PAGAR O VALOR MENSAL DE "+c.ValorMensalReal()+". /n"
							+ "DAS OBRIGA��ES DA SEGURADORA  /n"
							+ "Cl�usula 2�. A SEGURADORA fica obrigada a pagar o valor correspondente ao total das despesas e custos decorrentes dos danos experimentados pela SEGURADORA, quando da ocorr�ncia de sinistro ou infort�nios envolvendo o(a) SEGURADO(A), sobre o(a) qual recai o presente seguro. Tais parcelas indenizat�rias, ora pactuadas, devem necessariamente estar acobertadas e previstas neste contrato. /n"
							+ "Cl�usula 3�. A SEGURADORA est� obrigada a assegurar todos os servi�os dispostos neste contrato de maneira segura e eficaz.  /n"
							+ "DAS OBRIGA��ES DO (A) SEGURADO (A) /n"
							+ "Cl�usula 4�. O (a) SEGURADO (A) deve informar � SEGURADORA, por escrito, quaisquer fatos ou altera��es verificadas durante a vig�ncia deste contrato como a contrata��o ou cancelamento de qualquer outro seguro. /n"
							+ " Cl�usula 5�. Qualquer altera��o do contrato que seja de interesse do (a) SEGURADO (A) s� poder� ser feita com a concord�ncia expressa e inequ�voca da SEGURADORA. /n"
							+ " Cl�usula 6�. O (A) SEGURADO (A) tem o dever de fazer o pagamento da cota do pr�mio do seguro mesmo que tenham ocorrido imprevistos. /n"
							+ " DA SUB-ROGA��O DE DIREITOS /n"
							+ " Cl�usula 7�. No caso do pagamento da indeniza��o, o recibo valer� como instrumento de cess�o, na qual a SEGURADORA ficar� sub-rogada, at� o limite da indeniza��o, em todos os direitos e a��es do (a) SEGURADO (A) contra aqueles que por ato, fato ou omiss�o, tenham causado os preju�zos indenizados pela SEGURADORA ou para eles concorrido, obrigando o (a) SEGURADO (A) a facilitar os meios necess�rios ao exerc�cio dessa sub-roga��o.  /n"
							+ "DO PRAZO  /n"
							+ "Cl�usula 8�. A cobertura deste seguro ter� dura��o de at� o fim do contrato de trabalho entre empregador e empregado. /n"
							+ "DA RESCIS�O  /n"
							+ " Cl�usula 9�. Este contrato poder� ser rescindido, total ou parcialmente, a qualquer tempo, por iniciativa de ambas as partes, quando obtida a concord�ncia da outra parte, devendo ser observadas as disposi��es seguintes:  /n"
							+ "a) Se o pedido de rescis�o for do (a) SEGURADO (A), a SEGURADORA reter�, al�m dos lucros cessantes, o pr�mio calculado de acordo com o �ndice de corre��o em vigor; /n"
							+ "b) A cobertura estabelecida no contrato ficar� automaticamente cancelada, sem qualquer restitui��o de pr�mios e lucros cessantes, se a indeniza��o ou a soma das indeniza��es pagas atingir ou ultrapassar o valor do respectivo seguro. /n /n"
							+ "____________________________________________ /nAssinatura do (a) representante da Seguradora /n /n"
							+ " ____________________________________________  /nAssinatura do (a) segurado (a).", font);
					p1.setAlignment(Element.ALIGN_CENTER);
					try {
						doc.add(p1);
					} catch (DocumentException e) {
						e.printStackTrace();
					}
					
					doc.close();
					
					File pdf = new File("C:/Users/Daniel/Documents/"+c.getNome_funcionario()+c.getNome_empregador()+".pdf"); 
					try {
						Desktop.getDesktop().open(pdf);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
	}
}
