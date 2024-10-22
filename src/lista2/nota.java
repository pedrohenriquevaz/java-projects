package lista2;
import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			double nota1 = 0.00;
			double nota2 = 0.00;
			double nota3 = 0.00;
			double media = 0.00;
			int pesoMedia1 = 0;
			int pesoMedia2 = 0;
			int pesoMedia3 = 0;
			int mediaTipo = 0;
			String mediaFinal = "";

			System.out.println("Insira sua primeira nota: ");
			nota1 = scan.nextDouble();
			
			System.out.println("Insira sua segunda nota: ");
			nota2 = scan.nextDouble();
			
			System.out.println("Insira sua terceira nota: ");
			nota3 = scan.nextDouble();
			
			System.out.println("Escolha o Tipo de cálculo da média:");
			System.out.println("1 - Simples ou 2 - Ponderada");
			mediaTipo = scan.nextInt();
			
			if (mediaTipo == 1) {
				media = (nota1 + nota2 + nota3) / 3;
			}
			else {
				System.out.println("Informe o peso da primeira nota.");
				pesoMedia1 = scan.nextInt();
				
				System.out.println("Informe o peso da segunda nota.");
				pesoMedia2 = scan.nextInt();
				
				System.out.println("Informe o peso da terceira nota.");
				pesoMedia3 = scan.nextInt();
				
				media = (((nota1*pesoMedia1) + (nota2*pesoMedia2) + (nota3*pesoMedia3)) / (pesoMedia1 + pesoMedia2 + pesoMedia3));
			}
			
			mediaFinal = String.format("%.2f", media);
			
			System.out.println("Sua média final é: " + mediaFinal);
			
			scan.close();
	}
}
