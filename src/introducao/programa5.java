package introducao;
import java.util.Scanner;

public class programa5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
		System.out.println("Insira seu peso: ");
		peso = scan.nextDouble();
		
		System.out.println("Insira sua altura: ");
		altura = scan.nextDouble();

		imc = peso / (Math.pow(altura, 2));
		imc = Math.floor(imc);
		
		if (imc < 20) {
			System.out.println("A sua classificação IMC é " + imc + " e está Abaixo do peso.");
		} else if (imc > 20 && imc <= 25) {
			System.out.println("A sua classificação IMC é " + imc + " e está em Peso Normal.");
		} else if (imc > 25 && imc <= 30) {
			System.out.println("A sua classificação IMC é " + imc + " e está em Sobre Peso.");			
		} else if (imc > 30 && imc <= 40) {
			System.out.println("A sua classificação IMC é " + imc + " e está como Obeso.");	
		} else if (imc > 40) {
			System.out.println("A sua classificação IMC é " + imc + " e está em Obeso Mórbido.");
		}
		
		scan.close();
	}

}