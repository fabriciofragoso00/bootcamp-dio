package com.dio.criação;

public class Main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----Exercicio Calculadora----");
		Calculadora.soma(5, 5);
		Calculadora.subtrair(5, 5);
		Calculadora.multiplicacao(5, 5);
		Calculadora.divisao(5, 5);

		System.out.println("----Exercicio Mensagem----");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(2);
		
		System.out.println("----Exercicio Emprestimo----");
		Emprestimo.calcular(1000, Emprestimo.duasParcelas());
		Emprestimo.calcular(1000, Emprestimo.tresParcelas());
		Emprestimo.calcular(1000, 5);
	}

}
