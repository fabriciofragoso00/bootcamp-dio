package com.dio.EstruturaDeRepetição;

import java.util.Scanner;

public class Nome_Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		//int idade;
		
		while(true) {
			
			System.out.print("Nome: ");
			nome = sc.next();
			
			if(nome.equals("0")) {
				break;
			}
			
			System.out.print("Idade: ");
			//idade = sc.nextInt();
			sc.nextInt();
			
			System.out.println();
			System.out.println("Escreva novamente...");
			System.out.println();
		}

		System.out.println("Condição de parada aceita!");
		sc.close();
	}

}
