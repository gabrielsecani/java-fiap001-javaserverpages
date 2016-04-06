package br.fiap.rm72468.bean;

import javax.faces.bean.ManagedBean;

import br.fiap.rm72468.bo.CalculoJurosBO;

@ManagedBean
public class JurosBean {

	private double valorPresente;
	private double taxaJuros;
	private int periodoMeses;
	
	private String resultadoJuros;
	
	public int getPeriodoMeses() {
		return periodoMeses;
	}
	public void setPeriodoMeses(int periodoMeses) {
		this.periodoMeses = periodoMeses;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double getValorPresente() {
		return valorPresente;
	}
	public void setValorPresente(double valorPresente) {
		this.valorPresente = valorPresente;
	}
	public String getResultadoJuros(){
		return resultadoJuros;
	}	
	
	// Mensagem de erro
	private String msgErro;

	public String getMsgErro() {
		return msgErro;
	}
	//
	
	// Action do botão
	public String calcular(){
		
		try{
			if(taxaJuros<0)
				throw new Exception("aaaaaaaaaaaaaaaa deu ERRRRO!!!");
			
			// instancia BO
			CalculoJurosBO bo = new CalculoJurosBO(valorPresente, taxaJuros, periodoMeses);				
			resultadoJuros = bo.calcularFormatado();

			
			return "resposta";
		}catch(Exception e){
			msgErro = e.getMessage();
			return "erro";
		}
	}
}
