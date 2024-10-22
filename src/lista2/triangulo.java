package lista2;
import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double hipotenusa = 0.00;
		double cateto1 = 0.00;
		double cateto2 = 0.00;
		double somaCatetos = 0.00;					
		double calculoHipotenusa = 0.00;
		
		System.out.println("Informe a medida da Hipotenusa: ");
		hipotenusa = scan.nextDouble();
		
		System.out.println("Informe a medida do Cateto 1: ");
		cateto1 = scan.nextDouble();
		
		System.out.println("Informe a medida do Cateto 2: ");
		cateto2 = scan.nextDouble();
		
		somaCatetos = (Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2));
		calculoHipotenusa = Math.pow(hipotenusa, 2);
		
		if (somaCatetos == calculoHipotenusa) {
			System.out.println("Conforme as medidas informadas para o triângulo, este é um triângulo retângulo");
		}
		else {
			System.out.println("Este triângulo não é um triângulo retângulo.");			
		}

	}

}
