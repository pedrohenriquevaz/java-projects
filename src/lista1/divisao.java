package lista1;
import java.util.Scanner;

public class divisao {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Informe um número inteiro: ");
		number = scan.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("O número informado é divisível por 2.");
		}
		
		if (number % 5 == 0) {
			System.out.println("O número informado é divisível por 5.");
		}
		
		if (number % 10 == 0) {
			System.out.println("O número informado é divisível por 10.");
		}
		
		if (number % 2 != 0 && number % 5 != 0 && number % 10 != 0) {
			System.out.println("O número informado não é divisível por 10, 5 ou 2.");
		}

		scan.close();
	}

}