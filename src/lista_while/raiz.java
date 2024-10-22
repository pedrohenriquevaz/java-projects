package lista_while;
import java.util.Scanner;

public class raiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int impar = 1;
		int numero = 0;
		int subtracao = 0;
		int numeroUsuario = 0;
		
		System.out.println("Informe um numero: ");
		numero = scan.nextInt();
		numeroUsuario = numero;
		
		while(numero > 0) {
			numero = numero - impar;
			impar = impar + 2;
			subtracao++;
		}
		
		if(numero < 0) {
		System.out.println("A raiz quadrada aproximada de: " + numeroUsuario + " eh " + subtracao);
		} else {
			System.out.println("A raiz quadrada exata de: " + numeroUsuario + " eh " + subtracao);
		}
	}
}
