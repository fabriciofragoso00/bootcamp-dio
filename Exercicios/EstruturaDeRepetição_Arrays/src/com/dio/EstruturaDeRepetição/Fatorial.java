package com.dio.EstruturaDeRepetição;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int fatorial;
		int multiplicacao = 1;
		
		System.out.print("Fatorial: ");
		fatorial = sc.nextInt();
		
		for(int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		System.out.println(fatorial +"! = " + multiplicacao);
		sc.close();
	}

}
