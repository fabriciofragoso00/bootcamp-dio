package dio.com.br;

import java.util.*;

public class TaxaImpostoRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner leitor = new Scanner(System.in);
		  double renda = leitor.nextDouble();
		  double imposto = 0;
		  if (renda > 4500.0)
		  {
		  imposto = (3000.0 - 2000.01) * 0.08 + (4500.0 - 3000.01) * 0.18 + (renda - 4500.0) * 0.28;
		  } else if (renda > 3000.0)
		  {
		  imposto = (3000.0 - 2000.01) * 0.08 + (renda - 3000.01) * 0.18;
		  } else if (renda > 2000.0)
		  {
		  imposto = (renda - 2000.01) * 0.08;
		  }
		  if (imposto == 0)
		  {
		  System.out.printf("Isento");
		  } else
		  {
		  System.out.printf("R$ %.2f", imposto);
		  }
		  leitor.close();
	}

}
