import java.util.ArrayList;
import java.util.Scanner;

public class TresLista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double valor;
        double soma = 0;

        // Leitura dos valores
        System.out.println("Digite as notas (-1 para encerrar):");

        while (true) {
            valor = sc.nextDouble();

            if (valor == -1) {
                break;
            }

            notas.add(valor);
        }

        // Quantidade de valores lidos
        System.out.println("\nQuantidade de valores lidos: " + notas.size());

        // Valores na ordem informada
        System.out.println("\nValores na ordem informada:");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        // Valores na ordem inversa
        System.out.println("\n\nValores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // Soma dos valores
        for (double nota : notas) {
            soma += nota;
        }

        System.out.println("\nSoma dos valores: " + soma);

        // Média dos valores
        double media = soma / notas.size();
        System.out.println("Média dos valores: " + media);

        // Quantidade acima da média
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }

        System.out.println("Quantidade de valores acima da média: " + acimaMedia);

        // Quantidade abaixo de 7
        int abaixoSete = 0;
        for (double nota : notas) {
            if (nota < 7) {
                abaixoSete++;
            }
        }

        System.out.println("Quantidade de valores abaixo de 7: " + abaixoSete);

        // Mensagem final
        System.out.println("\nPrograma encerrado.");
        
        sc.close();
    }
}
