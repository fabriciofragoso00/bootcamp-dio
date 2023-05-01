package dio.com.br;

import java.util.*;

public class SomaDeTermos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double h = 0;
	     Scanner sc = new Scanner(System.in);
	     double n = sc.nextDouble();

	     for (int i = 1; i <= n; i++) {
	     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
	          h = h + (1d/i);
	           
	      }
	     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
	        
	        System.out.println(Math.round(h));
	        
	        sc.close();
	   }
	}


