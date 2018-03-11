package br.unifenas.movimentacao.ativo;

public class Cliente extends Pessoa {
	
	private long id;
	private Pessoa pessoa;
	
	
	public Cliente(long id, String nome, String end, String fone, String data, long id2, Pessoa pessoa) {
		super(id, nome, end, fone, data);
		id = id2;
		this.pessoa = pessoa;
	} 
	
	public Cliente() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	

}
