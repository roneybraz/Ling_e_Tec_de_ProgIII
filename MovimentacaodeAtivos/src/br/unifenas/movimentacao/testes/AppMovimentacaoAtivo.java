package br.unifenas.movimentacao.testes;

import br.unifenas.movimentacao.ativo.*;

public class AppMovimentacaoAtivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli =new Cliente();
		cli.setNome("Roney");
		
		Tecnico tec=new Tecnico();
		tec.setNome("batman");
		
		Endereco end=new Endereco();
		end.setCidade("Alfenas");
		
		Ativo ativo=new Ativo();
		ativo.setEndereco(new Endereco());
		ativo.setEspecificacoes("Impressora HP");
		
		Historico hist=new Historico();
		hist.setOnde_foi("Areado");
		
		Solicitacao solic=new Solicitacao();
		solic.setCliente(new Cliente());
		solic.setAtivo(new Ativo());
		solic.setTecnico(new Tecnico());
		solic.setPara_onde_vai("Alterosa");
		
			
		
		
		
	
		
		
		
		
		

	}

}
