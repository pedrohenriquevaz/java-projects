package testes;
import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int multiplicacao = 0;
		
		System.out.println("Informe um número inteiro: ");
		numero = scan.nextInt();
		multiplicacao = numero;
		
		for(int i = numero;i > 1;i--) {
			multiplicacao *= numero*(i);
		}
		
		System.out.println("O fatorial do numero informado é : " + multiplicacao);
		scan.close();
	}
}
