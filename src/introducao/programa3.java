package introducao;
import java.util.Scanner;

public class programa3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantidade = 0;
		int numero1 = -1;
		int numero2 = 1;
		int numero3 = 0;
		String sequencia = "";
		
		System.out.println("Preencha um número inteiro: ");
		quantidade = scan.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			 
			 numero3 = numero1 + numero2;
			 numero1 = numero2;
			 numero2 = numero3;			 
			 
			 if (quantidade - i == 1) {
				 sequencia += numero3;
			   } else {
				   sequencia += numero3 + ", ";					   
			   }
		}	
		
		System.out.println("Os primeiros " + quantidade + " números da sequência de Fibonacci são: " + sequencia);
	}	
}