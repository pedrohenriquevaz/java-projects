package lista_for;
import java.util.Scanner;

public class tabuada {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int tabuada = 0;
		
		System.out.println("Informe um número: ");
		numero = scan.nextInt();
		
		System.out.println("A tabuada do número informado é: ");
		
		for(int i = 1;i <= 10;i++) {
			tabuada = numero*i;
			System.out.println(numero + "x" + i + " = " + tabuada);
		}
		
		scan.close();
	}

}