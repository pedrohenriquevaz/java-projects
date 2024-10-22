package lista2;
import java.util.Scanner;

public class extenso {

    // Método para converter números de 0 a 99 para texto usando apenas if e else
    private static String numeroPorExtenso(int numero) {
        if (numero < 0 || numero > 99) {
            return "Número fora do intervalo permitido";
        }
        
        // Casos especiais para 0 a 19
        if (numero == 0) {
            return "zero";
        } else if (numero == 1) {
            return "um";
        } else if (numero == 2) {
            return "dois";
        } else if (numero == 3) {
            return "três";
        } else if (numero == 4) {
            return "quatro";
        } else if (numero == 5) {
            return "cinco";
        } else if (numero == 6) {
            return "seis";
        } else if (numero == 7) {
            return "sete";
        } else if (numero == 8) {
            return "oito";
        } else if (numero == 9) {
            return "nove";
        } else if (numero == 10) {
            return "dez";
        } else if (numero == 11) {
            return "onze";
        } else if (numero == 12) {
            return "doze";
        } else if (numero == 13) {
            return "treze";
        } else if (numero == 14) {
            return "quatorze";
        } else if (numero == 15) {
            return "quinze";
        } else if (numero == 16) {
            return "dezesseis";
        } else if (numero == 17) {
            return "dezessete";
        } else if (numero == 18) {
            return "dezoito";
        } else if (numero == 19) {
            return "dezenove";
        }
        
        // Casos para dezenas maiores que 19
        int dezena = numero / 10;
        int unidade = numero % 10;

        String extenso = "";

        if (dezena == 2) {
            extenso += "vinte";
        } else if (dezena == 3) {
            extenso += "trinta";
        } else if (dezena == 4) {
            extenso += "quarenta";
        } else if (dezena == 5) {
            extenso += "cinquenta";
        } else if (dezena == 6) {
            extenso += "sessenta";
        } else if (dezena == 7) {
            extenso += "setenta";
        } else if (dezena == 8) {
            extenso += "oitenta";
        } else if (dezena == 9) {
            extenso += "noventa";
        }

        // Adiciona a unidade, se não for zero
        if (unidade != 0) {
            extenso += " e ";
            if (unidade == 1) {
                extenso += "um";
            } else if (unidade == 2) {
                extenso += "dois";
            } else if (unidade == 3) {
                extenso += "três";
            } else if (unidade == 4) {
                extenso += "quatro";
            } else if (unidade == 5) {
                extenso += "cinco";
            } else if (unidade == 6) {
                extenso += "seis";
            } else if (unidade == 7) {
                extenso += "sete";
            } else if (unidade == 8) {
                extenso += "oito";
            } else if (unidade == 9) {
                extenso += "nove";
            }
        }

        return extenso;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        
        String idadePorExtenso = numeroPorExtenso(idade);
        System.out.println("A idade por extenso é: " + idadePorExtenso);
    }
}