package br.com.caelum.financas.mb;

import java.util.List;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Movimentacao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class MovimentacoesPorTitularBean {

	@Inject
	private MovimentacaoDao movimentacaoDao;
	
	private List<Movimentacao> movimentacoes;
	private String titular;
	

	public void lista() {
		System.out.println("Buscando as movimentacoes pelo titular da conta " + this.titular);
		movimentacoes = movimentacaoDao.buscaTodasMovimentacoesDaConta(titular);

	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
