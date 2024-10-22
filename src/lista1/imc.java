package lista1;
import java.util.Scanner;

public class imc {
	public static void main(String agrs[]) {
		Scanner scan = new Scanner(System.in);
		double peso = 0.00;
		double altura = 0.00;
		double imc = 0.00;
		
		System.out.println("Informe a sua altura: ");
		altura = scan.nextDouble();
		
		System.out.println("Informe o seu peso: ");
		peso = scan.nextDouble();
		
		imc = peso / (altura*altura);
		
		String imc2 = String.format("%.2f", imc);
		
		if (imc < 18.5) {
			System.out.println("Seu IMC calculado é de: " + imc2 + " e sua situação atual é de Magreza.");
		} 
		else 
			if (imc >= 18.5 && imc <= 24.9) {
				System.out.println("Seu IMC calculado é de: " + imc2 + " e sua situação atual é Normal.");
			} 
			else
				if (imc >= 25.00 && imc <= 29.9) {
					System.out.println("Seu IMC calculado é de: " + imc2 + " e sua situação atual é de Sobrepeso e Grau de Obesidade I.");
				} 
				else 
					if (imc >= 30.00 && imc <= 34.9) {
						System.out.println("Seu IMC calculado é de: " + imc2 + " e sua situação atual é de Obesidade Grau I.");
					}
					else 
						if (imc >= 35.00 && imc <= 39.9) {
							System.out.println("Seu IMC calculado é de: " + imc2 + " e sua situação atual é de Obesidade Grau II.");
						}
						else 
							if (imc > 40.00) {
								System.out.println("Seu IMC calculado é de: " + imc2 + " e sua situação atual é de Obesidade Grau III.");
							}
		
		scan.close();
		
	}

}
