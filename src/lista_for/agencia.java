package lista_for;
import java.text.DecimalFormat;
import java.util.Scanner;

public class agencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		boolean criterio1 = true;
		boolean criterio2 = true;
		boolean criterio3 = true;
		double candidatosInaptosIndustria = 0;
		double candidatosInaptosComercio = 0;
		int quantidadeIndustria = 0;
		int quantidadeComercio = 0;
		int areaDesejada = 0;
		int resposta = 0;		
		
		for(int i = 0;i < 4;i++) {
			System.out.println("");
			System.out.println("");
			System.out.println("Informe a Area desejada para aplicar.");
			System.out.println("Digite 1 para Comercio e 2 para Industria: ");
			areaDesejada = scan.nextInt();
			
			if(areaDesejada == 1) {
				quantidadeComercio++;
				
				System.out.println("Informe ha quanto tempo o candidato reside na cidade: ");
				resposta = scan.nextInt();
				
				if(resposta < 1) { 
					criterio1 = false;
				}
				
				System.out.println("O candidato possui o Segundo Grau completo?");
				System.out.println("Digite 1 (Sim) ou 2 (Nao).");
				resposta = scan.nextInt();
				
				if(resposta == 2) { 
					criterio2 = false;
				}
				
				System.out.println("O candidato possui Experiencia comprovada?");
				System.out.println("Digite 1 (Sim) ou 2 (Nao).");
				resposta = scan.nextInt();
				
				if(resposta == 2) {
					criterio3 = false;
				}
				
				if(criterio1 == false || criterio2 == false || criterio3 == false) {
					candidatosInaptosComercio++;
					
					if(criterio1 == false)
						System.out.println("O canditado foi considerado inapto para a area de Comercio por nao residir na cidade ao menos 1 ano.");
					
					if(criterio2 == false)
						System.out.println("O canditado foi considerado inapto para a area de Comercio por nao possuir o Segundo Grau completo.");
					
					if(criterio3 == false)
						System.out.println("O canditado foi considerado inapto para a area de Comercio por nao possuir Experiencia comprovada.");
				}
			} 
			else {
				quantidadeIndustria++;
				
				System.out.println("Informe o nivel de cargo desejado: ");
				System.out.println("Digite 1 (Operacional) ou 2 (Gerencia).");
				resposta = scan.nextInt();
				
				if(resposta == 1) {
					System.out.println("O candidato possui o Segundo Grau completo?");
					System.out.println("Digite 1 (Sim) ou 2 (Nao).");
					resposta = scan.nextInt();
					
					if(resposta == 2) { 
						criterio2 = false;
						
						System.out.println("O canditado foi considerado inapto para a area de Industria por nao possuir o Ensino Superior completo.");
					}
				} 
				else {
					System.out.println("O candidato possui o Ensino Superior completo?");
					System.out.println("Digite 1 (Sim) ou 2 (Nao).");
					resposta = scan.nextInt();
					
					if(resposta == 2) { 
						criterio2 = false;
					}
					
					System.out.println("O candidato possui Experiencia comprovada?");
					System.out.println("Digite 1 (Sim) ou 2 (Nao).");
					resposta = scan.nextInt();
					
					if(resposta == 2) { 
						criterio3 = false;
					}
					
					if(criterio2 == false || criterio3 == false) {
						candidatosInaptosIndustria++;
						
						if(criterio2 == false)
							System.out.println("O canditado foi considerado inapto para a area de Industria por nao possuir o Ensino Superior completo.");
						
						if(criterio3 == false)
							System.out.println("O canditado foi considerado inapto para a area de Comercio por nao possuir Experiencia comprovada.");
					}
				}
			}
			
			criterio1 = true;
			criterio2 = true;
			criterio3 = true;
	    }
		
		candidatosInaptosComercio = (candidatosInaptosComercio/quantidadeComercio) * 100;
		candidatosInaptosIndustria = (candidatosInaptosIndustria/quantidadeIndustria) * 100;

		System.out.println("");
		System.out.println("");
		System.out.println("Quantidade de candidatos para cada Area: ");
		System.out.println("Comercio: " + quantidadeComercio);
		System.out.println("Industria: " + quantidadeIndustria);
		System.out.println("");
		System.out.println("Percentual de candidatos inaptos por Area: ");
		System.out.println("Comercio: " + df.format(candidatosInaptosComercio));
		System.out.println("Industria: " + df.format(candidatosInaptosIndustria));
		
		scan.close();
	}

}
