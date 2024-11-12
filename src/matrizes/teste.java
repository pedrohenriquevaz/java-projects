package matrizes;
import java.util.Scanner;

public class teste {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um tamanho para X da matriz: ");
        int x = scan.nextInt();
        
        System.out.println("Informe um tamanho para Y da matriz: ");
        int y = scan.nextInt();
        
        int matriz[][] = new int[x][y];
    }
}