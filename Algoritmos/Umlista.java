import java.util.ArrayList;
import java.util.Scanner;

public class Umlista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        ArrayList <String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");        
        
        ArrayList <Double> temp = new ArrayList<>();
        for (int i = 0; i < meses.size(); i++) {
            
            System.out.println("\nQual foi a temperatura de " + meses.get(i) + ": ");
            double addTemp = sc.nextDouble();
            temp.add(addTemp);
            soma += temp.get(i);

        }

        double media = soma/meses.size();

        System.out.println("TEMPERATURA:");
        for (int i = 0; i < meses.size(); i++) {
            System.out.println("\nMês: " + meses.get(i) + " Temp: " + temp.get(i));
        }

        System.out.println("MÉDIA ANUAL: " + media + "\n");

        sc.close();
        
    }
}
