package br.unifenas.movimentacao.ativo;

public class Tecnico extends Pessoa {
	
	private long id;
	private Pessoa pessoa;
	private String usuario;
	private String senha;
	
	public Tecnico(long id, String nome, String end, String fone, String data, long id2, Pessoa pessoa, String usuario,
			String senha) {
		super(id, nome, end, fone, data);
		id = id2;
		this.pessoa = pessoa;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public Tecnico() {}

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

}
