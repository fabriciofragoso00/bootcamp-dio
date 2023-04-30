package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	// Local Date uma classe para trabalhar com datas
	private LocalDate data;

	public Mentoria() {
		
	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 25;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria ["
				+ "Titulo = " + getTitulo() + ", "
				+ "Descrição = " + getDescricao() + ", "
				+ "Data = " + data + 
				"]";
	}	
}
