package br.unifenas.movimentacao.ativo;

public class Ativo{
	
	private long id;
	private Endereco endereco;
	private String etiqueta;
	private String especificacoes;
	
	public Ativo(long id, Endereco endereco, String etiqueta, String especificacoes) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.etiqueta = etiqueta;
		this.especificacoes = especificacoes;
	}
	
	public Ativo() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	};
	
	
	
	

}
