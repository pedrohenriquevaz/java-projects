package lista2;

import java.util.Scanner;

public class ordena {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int um = 0;
		
		System.out.println("Informe o primeiro numero: ");
		double primeiro = s.nextDouble();
		System.out.println("Informe o segundo numero: ");
		double segundo = s.nextDouble();
		System.out.println("Informe o terceiro numero: ");
		double terceiro = s.nextDouble();
		
		System.out.println("Digite 1- Crescente ou 2- Decrescente");
		int ordem = s.nextInt();
		
		if(ordem == 1) {
			if(primeiro > segundo && primeiro > terceiro) {
				System.out.println(primeiro);
				if(segundo > terceiro) {
					System.out.println(segundo);
					System.out.println(terceiro);
				}else {
					System.out.println(terceiro);
					System.out.println(segundo);
				}
				
			}else if(segundo > primeiro && segundo > terceiro) {
				segundo = um;
			}else if(terceiro > primeiro && terceiro > segundo) {
				segundo = um;
			}
		}

	}

}
