package com.dio.OperadoresLogicos;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("b1 && b2 " + (b1 && b2));
		System.out.println("b1 && b3 " + (b1 && b3));
		System.out.println();
		
		System.out.println("b2 || b3 " + (b2 && b3));
		System.out.println("b2 || b4 " + (b2 && b4));
		System.out.println();
		
		System.out.println("b1 ^ b3 " + (b1 ^ b3));
		System.out.println("b4 ^ b1 " + (b4 ^ b1));
		System.out.println();
		
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println();
		
		int i1 = 18;
		int i2 = 5;
		
		float f1 = 20f;
		float f2 = 50f;
		
		System.out.println("((i1 + i2) < (f2 -f1)) && true " + (((i1 + i2) < (f2 -f1)) && true));
		System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10508d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println((salarioBaixo) && (muitosDependentes));
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		System.out.println("Recebe o auxilio: " + recebeAuxilio);
	
	}

}
