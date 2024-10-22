package lista_for;
import java.text.DecimalFormat;
import java.util.Scanner;

public class numeros3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		DecimalFormat df = new DecimalFormat("#0.00");
		int numero = 0;
		int quantidadePositivo = 0;
		int quantidadeMenorZero = 0;
		int quantidadeIntervalo = 0;
		double mediaPositivo = 0;
		
		for(int i = 0;i < 10;i++) {
			System.out.println("Informe um número inteiro: ");
			numero = scan.nextInt();
			
			if (numero < 0) {
				quantidadeMenorZero++;
			} 
			else {
				quantidadePositivo++;
				mediaPositivo += numero;
			}
			
			if(numero >= 5 && numero <= 50) {
				quantidadeIntervalo++;
			}
		}
		mediaPositivo = mediaPositivo/quantidadePositivo;
		
		System.out.println("A media dos valores positivos lidos é: " + df.format(mediaPositivo));
		System.out.println("A quantidade de numeros menores que zero é: " + quantidadeMenorZero);
		System.out.println("A quantidade de numeros no intervalo de 5 a 50 é: " + quantidadeIntervalo);

	}

}
