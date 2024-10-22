package lista_for;
import java.text.DecimalFormat;
import java.util.Scanner;

public class numeros4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double media = 0;
		int numero = 0;
		int maiorValor = 0;
		int menorValor = 0;
		int i = 0;
		
		for(i = 0;i < 10;i++) {
			System.out.println("Informe um numero inteiro: ");
			numero = scan.nextInt();
			
			if (i == 0) {
				menorValor = numero;
				maiorValor = numero;
			}
			else {
				if (numero < menorValor)
					menorValor = numero;
				
				if (numero > maiorValor)
					maiorValor = numero;
			}
			media += numero;
		}
		media = media/(i);	
		
		System.out.println("A media dos valores lidos �: " + df.format(media));
		System.out.println("O menor valor lido �: " + menorValor);
		System.out.println("O maior valor lido �: " + maiorValor);

		scan.close();
	}

}
