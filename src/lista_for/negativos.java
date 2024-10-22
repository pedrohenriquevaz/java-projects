package lista_for;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int negativo = 0;
		
		for(int i = 0;i < 5;i++) {
			System.out.println("Informe um numero: ");
			numero = scan.nextInt();
			
			if (numero < 0)
			   negativo++;
		}
		
		System.out.println("A quantidade de numeros negativos informados foi: " + negativo);

	}

}
