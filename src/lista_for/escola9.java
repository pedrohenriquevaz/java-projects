package lista_for;
import java.util.Scanner;

public class escola9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota = 0;
		double somaMedia = 0;
		double mediaAnual = 0;
		int quantidadeDez = 0;
		int quantidadeBom = 0;
		int quantidadeExemplar = 0;
		int quantidadeMediaMaxima = 0;
		int i = 0;
		int r = 0;
		
		for(i = 1;i <= 5;i++) {			
			for(r = 1;r <= 4;r++) {
				System.out.println("Informe a " + r + "°" + " nota do " + i + "°" + " Aluno: ");
				nota = scan.nextDouble();
				
				if(nota == 10)
				  quantidadeDez++;
				
				somaMedia += nota;
			}
			
			mediaAnual = somaMedia/(r-1);
		
			if(mediaAnual >= 7 && mediaAnual <= 7.9)
				quantidadeBom++;
			
			if(mediaAnual >= 9.00 && mediaAnual <= 10 && quantidadeDez >= 2) {
				quantidadeExemplar++;
				
				if(mediaAnual == 10)
					quantidadeMediaMaxima++;
			}
			
			somaMedia = 0;
			mediaAnual = 0;
			nota = 0;
			quantidadeDez = 0;
		}
		
		System.out.println("A quantidade de alunos com honras pelo bom aproveitamento foi: " + quantidadeBom);
		System.out.println("A quantidade de alunos que foram Alunos exemplares foi: " + quantidadeExemplar);
		System.out.println("E dos alunos exemplares, a quantidade que teve a média máxima foi: " + quantidadeMediaMaxima);
	}

}
