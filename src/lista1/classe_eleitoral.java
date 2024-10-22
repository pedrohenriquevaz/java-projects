package lista1;
import java.util.Scanner;

public class classe_eleitoral {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0;
		
		System.out.println("Informe sua idade: ");
		idade = scan.nextInt();
		
		if (idade < 16) {
			System.out.println("Conforme sua idade, você não é eleitor.");
		} 
		else 
			if (idade >= 18 && idade <= 65) {
				System.out.println("Conforme sua idade, você é eleitor obrigatório.");
			}
			else 
				if ((idade >= 16 && idade <= 17) || idade > 65) {
					System.out.println("Conforme sua idade, você é eleitor facultativo.");
				}
		
		scan.close();
	}

}
