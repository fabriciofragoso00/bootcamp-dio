package dio.com.br;

import java.util.*;

public class QuitandaZe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	       int morangos = input.nextInt();
	       int macas = input.nextInt();
	       
	       double valorFinal = 0;
	       double valorMorangos = 0;
	       double valorMacas = 0;

	//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
	      if(morangos <=5 && macas <= 5){
	        valorMorangos = morangos * 2.50;
	        valorMacas = macas * 1.80;
	        
	      }
	      
	      if(morangos > 5 && macas > 5){
	        valorMorangos = morangos * 2.20;
	        valorMacas = macas * 1.50;
	        
	      }
	      
	      valorFinal = valorMorangos + valorMacas;
	      
	      if(valorFinal > 25 || (macas + morangos > 8)){
	        valorFinal = valorFinal - (valorFinal*0.1);
	      }
	      
	      System.out.println(valorFinal);
	      
	      input.close();
	}

}
