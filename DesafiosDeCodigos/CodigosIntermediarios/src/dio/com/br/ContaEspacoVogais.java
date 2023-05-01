package dio.com.br;

import java.util.*;

public class ContaEspacoVogais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int espacosEmBranco = 0, quantVogais = 0;
	    
	    str = str.toLowerCase();
	    
	    for( int i=0; i<str.length(); i++ ){
	      char c = str.charAt(i);
	      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
	          quantVogais++;
	      }
	      if( str.charAt(i) == ' ' ){ 
	        espacosEmBranco++;
	      }
	    }
	 
	    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
	    sc.close();
	}

}
