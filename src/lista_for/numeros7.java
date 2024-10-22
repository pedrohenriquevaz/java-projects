package lista_for;
import java.text.DecimalFormat;
import java.util.Scanner;

public class numeros7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double percentualNegativo = 0;
		double percentualPositivo = 0;
		int numero = 0;
		int i = 0;
		
		for(i = 0;i < 9;i++) {
           System.out.println("Informe um numero inteiro: ");
           numero = scan.nextInt();
           
           if(numero < 0) {
        	  percentualNegativo++; 
           } else 
        	   if (numero > 0) {
        		  percentualPositivo++;
           }
		}
		
		percentualNegativo = (percentualNegativo / i)*100;
		percentualPositivo = (percentualPositivo / i)*100;

		System.out.println("A porcentagem de números negativos é de: " + df.format(percentualNegativo));
		System.out.println("A porcentagem de números positivos é de: " + df.format(percentualPositivo));
		
	}

}
