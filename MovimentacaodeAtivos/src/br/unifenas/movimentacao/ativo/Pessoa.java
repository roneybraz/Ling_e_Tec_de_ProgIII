package br.unifenas.movimentacao.ativo;

public  abstract class Pessoa {
	
	private long id;
	private String nome;
	private String end;
	private String fone;
	private String data;
	
	public Pessoa(long id, String nome, String end, String fone, String data) {
		super();
		this.id = id;
		this.nome = nome;
		this.end = end;
		this.fone = fone;
		this.data = data;
	}
	
	public Pessoa() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	};
	
	
	

	
	
	

}
