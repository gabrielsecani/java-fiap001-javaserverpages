package br.fiap.rm72468.bean;

import java.text.NumberFormat;

import javax.faces.bean.ManagedBean;

import br.fiap.rm72468.bo.Saude;

@ManagedBean
public class SaudeBean {

	// propriedades de entrada
	private Double peso;
	private Double altura;

	// metodos de acessos
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		System.out.println("peso:" + peso);
		this.peso = peso;

	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		System.out.println("altura:" + altura);
		this.altura = altura;
	}

	// Propriedade de saida (placeholder)
	private Double imc;
	public String getImc(){
		NumberFormat f=NumberFormat.getNumberInstance();
		f.setMaximumFractionDigits(2);
		
		return f.format(imc);
	}
	
	// metodos de ação do controller (Action Controller)
	public String calcular(){
		Saude bo = new Saude();
		try{
			imc = bo.calcularIMC(peso, altura);
		}catch(Exception e){
			return "erro";
		}		
		return "resultado";		
	}
}
