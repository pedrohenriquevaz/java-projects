package lista_for;

import java.util.Scanner;

public class primos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int quantidadePrimo = 0;
		boolean primo = true;
		
		for(int i = 0;i < 5;i++) {
			System.out.println("Informe um valor: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
			   primo = false;
			} else {
				if(numero % 3 == 0) {
				   primo = false;
				} else {
					if(numero % 5 == 0) {
					   primo = false;	
					} else {
						quantidadePrimo++;
					}
				}
			}
		}
		
		System.out.println("A quantidade de números primos informados é: " + quantidadePrimo);
	}
}
