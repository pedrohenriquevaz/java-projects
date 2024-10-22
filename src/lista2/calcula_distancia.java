package lista2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class calcula_distancia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double distancia = 0;
		
		System.out.println("Atributa o valor x do ponto 1: ");
		x1 = scan.nextInt();
		
		System.out.println("Atributa o valor y do ponto 1: ");
		y1 = scan.nextInt();
		
		System.out.println("Atributa o valor x do ponto 2: ");
		x2 = scan.nextInt();
		
		System.out.println("Atributa o valor y do ponto 2: ");
		y2 = scan.nextInt();
		
		if (x1 > x2) {
			System.out.println("Os valores não são válidos.");
		} 
		else {
			distancia = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
			distancia = Math.sqrt(distancia);
			DecimalFormat df = new DecimalFormat("#0.00");
			
			System.out.println("A distância entre os pontos é de: " + df.format(distancia));
		}
		
		scan.close();
	}
}
