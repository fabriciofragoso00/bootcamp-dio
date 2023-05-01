package dio.com.br;

import java.util.*;

public class ImprimindoPositivosMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
	     int cont = 0;
	     double media = 0;
	     double x;

	     //TODO: Implemente as condições adequadas para obter a quantidade 
	    //de valores positivos e a média dos valores positivos:
	        for (int i = 0; i < 6; i++) {
	        	x = leitor.nextDouble();
	          if(x > 0){
	            cont++;
	            media = media + x;
	          }
	        	
	        }
	        
	        media =media/cont ;
	        System.out.println(cont + " valores positivos");
	        System.out.println(String.format("%.1f", media));
	        
	        leitor.close();
	}

}
