package testes;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Informe um número inteiro: ");
		numero = scan.nextInt();
		
		for(int i = 1;i <= 10;i++) {
			System.out.println(i + "x" + numero + " = " + numero*i);
		}
	}

}
