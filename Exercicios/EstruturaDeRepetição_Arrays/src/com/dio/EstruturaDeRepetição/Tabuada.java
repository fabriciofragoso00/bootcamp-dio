package com.dio.EstruturaDeRepetição;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int tabuada;
		
		System.out.print("Escolha a tabuada desejada: ");
		tabuada = sc.nextInt();
		
		System.out.println();
		System.out.println("Tabuada de: " + tabuada);
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " * " + i + " = " + (tabuada * i));
		}
		
		sc.close();
		

	}

}
