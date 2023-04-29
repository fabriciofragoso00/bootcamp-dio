package com.dio.EstruturaDeRepetição;

import java.util.Scanner;

public class Maior_Media {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = 5;
		int [] numeros = new int [N];
		
		double media;
		double soma = 0;
		int aux = 0;
		
		System.out.println("Digite 5 números:");
		for(int i = 0; i < N; i++) {
			numeros[i] = sc.nextInt();
			
			if(numeros[i] > aux) {
				aux = numeros[i];
			}
			
			soma = soma + numeros[i];
		}
		
		media = soma/N;
		
		System.out.println("Maior numero: " + aux);
		System.out.println("Media: " + media);
		
		System.out.println();
		System.out.println("--------------OUTRO METODO--------------");
		System.out.println();
		
		//Alternativa DoWhile!
		doWhile();
		
		sc.close();
	}

	private static void doWhile() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		int count = 0;
		int maior = 0;
		double soma = 0;
		
		System.out.println("Digite 5 números:");
		do {
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
			}
			soma = soma + numero;
			count++;
		}while(count < 5);
		
		System.out.println("Maior numero: " + maior);
		System.out.println("Media: " + soma/5);
		
		sc.close();
	}
}
