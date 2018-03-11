package br.unifenas.movimentacao.ativo;

public class Solicitacao {
	
	private long id;
	private Cliente cliente;
	private Ativo ativo;
	private Tecnico tecnico;
	private String informacoes;
	private String para_onde_vai;
	
	public Solicitacao(long id, Cliente cliente, Ativo ativo, Tecnico tecnico, String informacoes,
			String para_onde_vai) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.ativo = ativo;
		this.tecnico = tecnico;
		this.informacoes = informacoes;
		this.para_onde_vai = para_onde_vai;
	}
	
	public Solicitacao() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ativo getAtivo() {
		return ativo;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	public String getPara_onde_vai() {
		return para_onde_vai;
	}

	public void setPara_onde_vai(String para_onde_vai) {
		this.para_onde_vai = para_onde_vai;
	};
	
	
	
	

}
