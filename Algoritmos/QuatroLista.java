import java.util.ArrayList;
import java.util.Scanner;

public class QuatroLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista para armazenar as vendas brutas
        ArrayList<Double> vendas = new ArrayList<>();

        // Array de contadores dos salários
        int[] faixas = new int[9];

        double venda;

        System.out.println("Digite as vendas brutas dos vendedores.");
        System.out.println("Digite -1 para encerrar.");

        // Entrada de dados
        while (true) {
            System.out.print("Venda bruta: ");
            venda = sc.nextDouble();

            if (venda == -1) {
                break;
            }

            vendas.add(venda);
        }

        // Cálculo dos salários e contagem das faixas
        for (double valorVenda : vendas) {

            double salario = 200 + (valorVenda * 0.09);

            // Determina a faixa salarial
            int indice = (int) salario / 100 - 2;

            if (indice >= 0 && indice <= 7) {
                faixas[indice]++;
            } else {
                // Salários de 1000 ou mais
                faixas[8]++;
            }
        }

        // Exibição dos resultados
        System.out.println("\nQuantidade de vendedores por faixa salarial:");

        System.out.println("$200 - $299: " + faixas[0]);
        System.out.println("$300 - $399: " + faixas[1]);
        System.out.println("$400 - $499: " + faixas[2]);
        System.out.println("$500 - $599: " + faixas[3]);
        System.out.println("$600 - $699: " + faixas[4]);
        System.out.println("$700 - $799: " + faixas[5]);
        System.out.println("$800 - $899: " + faixas[6]);
        System.out.println("$900 - $999: " + faixas[7]);
        System.out.println("$1000 em diante: " + faixas[8]);

        System.out.println("\nPrograma encerrado.");

        sc.close();
    }
}
