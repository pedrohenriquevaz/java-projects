package vetores;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o número de termos da sequência de Fibonacci que deseja gerar: ");
        int n = scan.nextInt();
        
        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            int[] fibonacci = new int[n];
            calcularFibonacci(fibonacci);
            exibirFibonacci(fibonacci);
        }

        scan.close();
    }
    
    public static void calcularFibonacci(int[] fibonacci) {
        if (fibonacci.length > 0) {
            fibonacci[0] = 0;
        }
        if (fibonacci.length > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
    
    public static void exibirFibonacci(int[] fibonacci) {
        System.out.println("Sequência de Fibonacci:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }

}
