package br.unifenas.movimentacao.ativo;

public class Endereco {
	
	private long id;
	private String numero;
	private String rua;
	private String cep;
	private String cidade;
	
	public Endereco(long id, String numero, String rua, String cep, String cidade) {
		super();
		this.id = id;
		this.numero = numero;
		this.rua = rua;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	public Endereco() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	};
	
	
	
	

}
