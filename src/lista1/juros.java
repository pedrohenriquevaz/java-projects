package lista1;
import java.util.Scanner;

public class juros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double saldoMedio = 0.00;
		double credito = 0.00;
		
		System.out.println("Informe o saldo médio do último ano: ");
		saldoMedio = scan.nextDouble();
		
		if (saldoMedio >= 0.00 && saldoMedio <= 500) {
			System.out.println("O credito de acordo com o saldo médio informado será de: " + credito);
		} 
		else 
			if (saldoMedio >= 501 && saldoMedio <= 1000) {
				credito = saldoMedio * 0.30;
				credito = credito + (credito * 0.02);
				System.out.println("O credito de acordo com o saldo médio informado será de: " + credito);
			}
			else 
				if (saldoMedio >= 1001 && saldoMedio <= 3000) {
					credito = saldoMedio * 0.40;
					credito = credito + (credito * 0.02);
					System.out.println("O credito de acordo com o saldo médio informado será de: " + credito);
				}
				else 
					if (saldoMedio >= 3001) {
						credito = saldoMedio * 0.50;
						credito = credito + (credito * 0.02);
						System.out.println("O credito de acordo com o saldo médio informado será de: " + credito);
					}
	
		scan.close();
		
		
	}

}
