package lista_while;
import java.util.Scanner;

public class Lucro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String produtoNome = "";
		double valorCompra = 0;
		double valorCompraTotal = 0;
		double valorVenda = 0;
		double valorVendaTotal = 0;
		double lucroTotal = 0;
		int lucroMenor10 = 0;
		int lucroEntre1020 = 0;
		int lucroMaior20 = 0;
		
		System.out.println("Informe o nome de um produto: ");
		produtoNome = scan.next();
		
		while(produtoNome.equalsIgnoreCase("X") == false) { 			
			System.out.println("Informe o valor de compra do produto " + produtoNome + ":");
			valorCompra = scan.nextDouble();
			valorCompraTotal += valorCompra;
			
			System.out.println("Informe o valor de venda do produto " + produtoNome + ":");
			valorVenda = scan.nextDouble();
			valorVendaTotal += valorVenda;
			
			lucroTotal += (valorVenda - valorCompra);
			
			if((((valorVenda - valorCompra)*100)/valorCompra) < 10) {
				lucroMenor10++;
			} else 
				if ((((valorVenda - valorCompra)*100)/valorCompra) >= 10 && (((valorVenda - valorCompra)*100)/valorCompra) <= 20) {
				  lucroEntre1020++;
				} else {
					lucroMaior20++;
				}
			
			valorCompra = 0;
			valorVenda = 0;	
			
			System.out.println("Informe o nome de um produto ou X para parar o programa: ");
			produtoNome = scan.next();
		}
		
		System.out.println(lucroMenor10 + " mercadoria(s) têm um lucro menor que 10%.");
		System.out.println(lucroEntre1020 + " mercadoria(s) têm um lucro maior ou igual a 10% e menor ou igual a 20%.");
		System.out.println(lucroMaior20 + " mercadoria(s) têm um lucro maior que 20%.");
		System.out.println("O valor total de compra é de: " + valorCompraTotal);
		System.out.println("O valor total de venda é de: " + valorVendaTotal);
		System.out.println("O valor total de lucro é de: " + lucroTotal);
	}

}
