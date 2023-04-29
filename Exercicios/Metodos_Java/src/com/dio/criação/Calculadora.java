package com.dio.criação;

public class Calculadora {
	
	public static void soma(double numero1, double numero2){
		double resultado;
		
		resultado = numero1 + numero2;
		System.out.println("soma: " + numero1 + " + " + numero2 + " = " + resultado);
	}
	
	public static void subtrair(double numero1, double numero2){
		double resultado;
		
		resultado = numero1 - numero2;
		System.out.println("subtração: " + numero1 + " + " + numero2 + " = " + resultado);
	}
	
	public static void multiplicacao(double numero1, double numero2){
		double resultado;
		
		resultado = numero1 * numero2;
		System.out.println("multiplicação: " + numero1 + " + " + numero2 + " = " + resultado);
	}
	
	public static void divisao(double numero1, double numero2){
		double resultado;
		
		resultado = numero1 / numero2;
		System.out.println("divisão: " + numero1 + " + " + numero2 + " = " + resultado);
	}

}
