import java.util.ArrayList;
import java.util.Scanner;

public class DoisLista {
    public static void main(String[] args) {
        int contagemSim = 0;
        int resposta;
        boolean loop;

        Scanner ls = new Scanner(System.in);
        ArrayList<String> perguntas = new ArrayList<>();
        
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        for (int i = 0; i < perguntas.size(); i++) {
            loop = true;
            System.out.println(perguntas.get(i));
        
            while (loop) {
        
                System.out.println("(1 para sim, 2 para não.)");
                resposta = ls.nextInt();
        
            if (resposta == 1) {
                contagemSim++;
                loop = false;    
            
            } else if (resposta == 2) {
                loop = false;
            }else{

                System.out.println("ERROR! Digite novamente!");
        
            }
    
    }

        }

        if (contagemSim == 2) {

            System.out.println("SUSPEITA!");
            
        } else if (contagemSim > 2 && contagemSim < 5) {

            System.out.println("CÚMPLICE!");
            
        }else if (contagemSim < 2 ) {

            System.out.println("Inocente.");
            
        }else{

            System.out.println("ASSASINO!");

        }

        ls.close();
    }
}
