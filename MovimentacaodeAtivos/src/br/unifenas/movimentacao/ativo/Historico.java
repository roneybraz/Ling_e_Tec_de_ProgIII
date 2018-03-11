package br.unifenas.movimentacao.ativo;

public class Historico{
	
	private long id;
	private Solicitacao solicitacao;
	private String onde_foi;
	
	
	
	public Historico(long id, Solicitacao solicitacao, String onde_foi) {
		super();
		this.id = id;
		this.solicitacao = solicitacao;
		this.onde_foi = onde_foi;
	}

	public Historico() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getOnde_foi() {
		return onde_foi;
	}

	public void setOnde_foi(String onde_foi) {
		this.onde_foi = onde_foi;
	};
	
	
	
	

}
