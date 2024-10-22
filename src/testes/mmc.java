package testes;
import java.util.Scanner;

public class mmc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int multiplicacao = 1;

        System.out.println("Informe o primeiro n�mero inteiro: ");
		numero1 = scan.nextInt();
		
		if (numero1 < 1) {
		   System.out.println("O valor n�o � um n�mero correto.");
		   return;
		} 
		else {
			System.out.println("Informe o segundo n�mero inteiro: ");
			numero2 = scan.nextInt();
			
			if (numero2 < 1) {
				   System.out.println("O valor n�o � um n�mero correto.");
				   return;
				} 
			else {
				System.out.println("Informe o terceiro n�mero inteiro: ");
				numero3 = scan.nextInt();
				
				if (numero3 < 1) {
					   System.out.println("O valor n�o � um n�mero correto.");
					   return;
					} 
			}
		}

        int divisor = 2; 
        while (numero1 > 1 || numero2 > 1 || numero3 > 1) {
            boolean divisaoFeita = false;

            if (numero1 % divisor == 0) {
                numero1 /= divisor;
                divisaoFeita = true;
            }

            if (numero2 % divisor == 0) {
                numero2 /= divisor;
                divisaoFeita = true;
            }

            if (numero3 % divisor == 0) {
                numero3 /= divisor;
                divisaoFeita = true;
            }

            if (divisaoFeita) {
                multiplicacao *= divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("O MMC dos n�meros informados �: " + multiplicacao);
        scan.close();
    }
}