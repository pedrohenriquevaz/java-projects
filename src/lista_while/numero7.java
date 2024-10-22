package lista_while;
import java.util.Scanner;

public class numero7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int resto = 0;
		int divisao = 0;
		int numeroAux = 0;
		
		System.out.println("Informe um numero de 4 algarismos: ");
		numero = scan.nextInt();
		
		while(numero >= 1000 && numero <= 9999) {
			divisao = numero / 100;
			resto = numero % 100;
			numeroAux = divisao + resto;
			
			if((numeroAux) == numero) {
				System.out.println("O numero informado possui a caracteristica, onde: ");
				System.out.println(numero + ":" + divisao + " + " + resto + " = " + numeroAux + "^" + numeroAux + "=" + numero);
			} else {
				System.out.println("O numero informado nao possui a caracteristica.");
			}
			
			System.out.println("Informe um numero de 4 algarismos: ");
			numero = scan.nextInt();	
		}

	}

}
