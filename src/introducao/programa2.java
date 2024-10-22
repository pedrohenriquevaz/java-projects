package introducao;
import java.util.Scanner;

public class programa2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite um número inteiro positivo: ");
		numero = scan.nextInt();
		String numeros = "";
		
		if (numero > 1) {
			
			for (int i = 2; numero > i; i++) {
				if (i % 2 == 0 || i % 5 == 0 || i % 3 == 0) {
				}
				else {
				   if (numero - i <= 3) {
					   numeros += i;
				   }
				   else {
					   numeros += i + ", ";					   
				   }
				}
			}
			System.out.println("Números primos menores que " + numero + " são: " + numeros);	
			
		}
		else if (numero < 0) {
			System.out.println("O numéro informado é inválido");
			}
			else {
				System.out.println(numero + " não é um número primo");	
			}
	}

}
