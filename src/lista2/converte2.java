package lista2;

import java.util.Scanner;

public class converte2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totais = 0;
		int idadeDias = 0;
		int idadeMeses = 0;
		int idadeAnos = 0;
		int calculoMeses = 0;
		
		System.out.println("Informe a idade em dias totais de vida: ");
		totais = scan.nextInt();
		
		idadeAnos = ((totais / 365));
		calculoMeses = (totais % 365);
		
		idadeMeses = (calculoMeses / 30);
		idadeDias = (calculoMeses % 30);		
		
		System.out.println("Sua idade em dias é: " + idadeDias + " dias");
		System.out.println("Sua idade em meses é: " + idadeMeses + " meses");
		System.out.println("Sua idade em anos é: " + idadeAnos + " anos");
		
		scan.close();
	}

}