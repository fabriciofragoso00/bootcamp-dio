package dio.com.br;

import java.util.*;

public class FabricaDeCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int PercentualImpostos = scan.nextInt();

        int custoConsumidor;
     
        int Distribuidor;
        int ValorImpostos;
 
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
 
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        
        custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
 
        System.out.println(custoConsumidor);
        
        scan.close();
	}

}
