package br.fiap.rm72468.bo;

import java.text.NumberFormat;

public class CalculoJurosBO {

	private double valorPresente;
	private double taxaJuros;
	private int periodoMeses;
	
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
	
	public CalculoJurosBO(double valorPresente, double taxaJuros, int periodoMeses) {
		super();
		this.valorPresente = valorPresente;
		this.taxaJuros = taxaJuros;
		this.periodoMeses = periodoMeses;
	}

	public double calcular(){		
		return valorPresente * Math.pow(1 + taxaJuros/100.0, periodoMeses);
	}
	
	/**
	 * Calcula Juros composto
	 * @param valorPresente Valor do presente
	 * @param taxaJuros Taxa de juros
	 * @param periodoMeses Periodo para calculo de juros em Meses
	 * @return valor do juros composto
	 */
	public String calcularFormatado(){
		NumberFormat f = NumberFormat.getNumberInstance();
		f.setMaximumFractionDigits(2);

		return f.format(calcular());
	}
	
}
