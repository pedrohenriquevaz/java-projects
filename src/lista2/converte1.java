package lista2;
import java.util.Scanner;

public class converte1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		int idadeDias;
		
		System.out.println("Informe a idade em anos: ");
		anos = scan.nextInt();
		
		System.out.println("Informe os meses: ");
		meses = scan.nextInt();
		
		System.out.println("Informe os dias: ");
		dias = scan.nextInt();
		
		idadeDias = ((anos * 365) + (meses * 30)) + dias;
		
		System.out.println("Sua idade em dias é: " + idadeDias);

	}
}
