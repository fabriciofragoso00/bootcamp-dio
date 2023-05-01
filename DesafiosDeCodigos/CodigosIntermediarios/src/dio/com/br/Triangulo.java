package dio.com.br;

import java.util.*;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;
		boolean triangulo;
		
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
		
		if(A>B && A>C){
		  maior = A;
		}else if(B>C){
		  maior = B;
		}else{
		  maior = C;
		}
		
		if(maior == A){
		  soma = B+C;
		}else if(maior == B){
		  soma = A+C;
		}else{
		  soma = B+A;
		}
		
		if(soma > maior){
		  triangulo = true;
		}else{
		  triangulo = false;
		}
		
		if(triangulo == true){
		  System.out.println("Perimetro =  " + (A+B+C));
		}else{
		  System.out.println("Area =  " + ((A+B)*C)/2);
		}
		
		leitor.close();
	}

}
