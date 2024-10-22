package vetores;
import java.util.Scanner;

public class Challenge {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um tamanho para o vetor: ");
		int tamanhoVetor = scan.nextInt();
		
		int vetor[] = new int[tamanhoVetor];
		
		vetor = preencheVetor(vetor);
		
		exibeVetor(vetor);
		
		descobreMaior(vetor);
		
		vetor = alteraVetor(vetor);
		
		descobreMaior(vetor);
	}
	
	public static int[] preencheVetor(int[] vetor) {
		Scanner scan = new Scanner(System.in);

		for(int i = 0;i < vetor.length;i++) {
			System.out.println("Informe um valor para o " + (i+1) +"°" + " indice do Vetor: ");
			vetor[i] = scan.nextInt();
		}
		
		return vetor;
	}
	
	public static void exibeVetor(int[] vetor) {
		for(int i = 0;i < vetor.length;i++) {
			System.out.println("O valor para o " + (i+1) +"°" + " indice do Vetor é: " + vetor[i]);
		}
	}
	
	public static void descobreMaior(int[] vetor) {
		int maiorValor = 0;
		
		for(int i = 0;i < vetor.length;i++) {
			if(maiorValor < vetor[i]) {
				maiorValor = vetor[i];
			}
		}
		System.out.println("O maior valor do vetor é: " + maiorValor);
	}
	
	public static int[] alteraVetor(int[] vetor) {
		Scanner scan = new Scanner(System.in);
		int indice = 0;
		
		System.out.println("Informe um indice do vetor para alterar: ");
		indice = scan.nextInt();
		
		while(indice < 0 || indice >= vetor.length) {
			System.out.println("O indice informado é invalido, informe outro valor: "); 
			indice = scan.nextInt();
		}
		
		System.out.println("Informe o valor desejado: ");
		vetor[indice] = scan.nextInt();
		
		return vetor;
	}
}
