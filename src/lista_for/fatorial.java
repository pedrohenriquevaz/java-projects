package lista_for;
import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int fatorial = 0;

		System.out.println("Informe um numero: ");
		numero = scan.nextInt();
		fatorial = numero;
		numero = numero - 1;
		
		for(int i = 1;numero != i;numero--) {
		   fatorial *= numero;
		}
		
		System.out.println("O fatorial do numero informado é: " + fatorial);
		scan.close();
	}

}
