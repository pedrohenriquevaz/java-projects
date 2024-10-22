package introducao;
import java.util.Scanner;

public class programa1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double notaFinal = 0;

		System.out.println("Informe a 1° nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Informe a 2° nota: ");
		nota2 = scan.nextDouble();
		System.out.println("Informe a 3° nota: ");
		nota3 = scan.nextDouble();
	
		notaFinal = (nota1 + nota2 + nota3);
		notaFinal = (notaFinal / 3);
		
		if (notaFinal >= 7) {
			System.out.println("NENEM DA DADAI PASSOU");
		}
		else if (notaFinal >= 5 && notaFinal < 7) {
			System.out.println("NENEM DA DADAI EXAME");
		}
		else if (notaFinal < 5) {
			System.out.println("NENEM DA DADAI LEPOVOU");		
		}
	}
}
