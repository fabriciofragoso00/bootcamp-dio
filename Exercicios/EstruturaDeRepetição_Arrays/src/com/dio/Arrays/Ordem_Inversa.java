package com.dio.Arrays;

public class Ordem_Inversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vetor = {-5, -6, 15, 50, 8, 4};
		
		System.out.print("Vetor: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor inverso: ");
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		System.out.println("-----------OUTRO METODO----------");
		
		//Alternativa while
		metodoWhile();
		
	}

	private static void metodoWhile() {
		// TODO Auto-generated method stub
		
		int [] vetor = {-5, -6, 15, 50, 8, 4};
		int i = 0;
		int j = vetor.length-1;
		
		System.out.print("Vetor: ");
		while(i < (vetor.length)) {
			System.out.print(vetor[i] + " ");
			i++;
		}
		System.out.println();
		System.out.print("Vetor inverso: ");
		while( j >= 0) {
			System.out.print(vetor[j] + " ");
			j--;
		}
	}
}
