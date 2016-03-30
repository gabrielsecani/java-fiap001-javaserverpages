package br.fiap.rm72468.bo;

public class Saude {
	public Double calcularIMC(Double peso, Double altura){
		return peso / Math.pow(altura, 2);		
	}
}
