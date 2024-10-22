package introducao;
import java.util.Scanner;

public class programa4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Escreva um número: ");
		numero = scan.nextInt();
		
		if (numero % 10 == 0) {
			System.out.println("O número " + numero + " é divisivel por 10.");
		} else if (numero % 5 == 0) {
			System.out.println("O número " + numero + " é divisivel por 5.");
		} else if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é divisivel por 2.");			
		} else {
			System.out.println("O número " + numero + " não é divisivel por 10, 5 ou 2.");	
		}

	}

}
