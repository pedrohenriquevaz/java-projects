package lista_while;
import java.util.Scanner;

public class base10 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int executaPrograma = 1;
		int numero = 0;
		String base2 = "";
		
		
		while(executaPrograma == 1) {
			numero = 0;
			base2 = "";
			System.out.println("Informe um número: ");
			numero = scan.nextInt();
			
			while(numero >= 2) {
				base2 = (numero % 2) + base2;
				numero = numero / 2;
				
			}
			base2 = numero + base2;	
			
			System.out.println("O número informado na base 2 é: " + base2);	
			System.out.println("Digite 1 para continuar o programa.");
			executaPrograma = scan.nextInt();
		}
		scan.close();
	}
}
